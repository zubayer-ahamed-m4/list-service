package com.codersknowledge.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;
import com.codersknowledge.service.ListService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@Service
public class ListServiceImpl implements ListService {

	private static final String ERROR_STRING = "Error : {}";

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public ListHead saveListHead(ListHead listHead) {
		if(listHead == null) return null;
		try {
			em.persist(listHead);
			if(listHead.getDataLists() != null && !listHead.getDataLists().isEmpty()) {
				for(DataList dl : listHead.getDataLists()) {
					dl.setListCode(listHead.getListCode());
					em.persist(dl);
				}
			}
		} catch (Exception e) {
			log.error(ERROR_STRING, e.getMessage());
			return null;
		}
		return listHead;
	}

	@Override
	@Transactional
	public DataList saveDataList(DataList dataList) {
		if(dataList == null) return null;
		try {
			em.persist(dataList);
		} catch (Exception e) {
			log.error(ERROR_STRING, e.getMessage());
			return null;
		}
		return dataList;
	}



	@Override
	public ListHead findListByListCode(String listCode) {
		StringBuilder lhSql = new StringBuilder("SELECT lh FROM ListHead lh WHERE UPPER(lh.listCode)=:listCode");
		List<ListHead> lhList = em.createQuery(lhSql.toString(), ListHead.class).setParameter("listCode", listCode.trim().toUpperCase()).getResultList();
		if(lhList == null || lhList.isEmpty()) return null;

		ListHead lh = lhList.stream().findFirst().orElse(null);
		if(lh == null) return null;

		StringBuilder dlSql = new StringBuilder("SELECT dl FROM DataList dl WHERE UPPER(dl.listCode)=:listCode");
		List<DataList> dlList = em.createQuery(dlSql.toString(), DataList.class).setParameter("listCode", listCode.trim().toUpperCase()).getResultList();
		if(dlList != null && !dlList.isEmpty()) {
			lh.setDataLists(dlList);
		}
		return lh;
	}

	@Override
	public boolean listValidate(ListHead listHead) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listValidate(DataList dataList) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
