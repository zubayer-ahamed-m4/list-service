package com.codersknowledge.service.impl;

import java.util.Collections;
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
	public ListHead updateListHead(ListHead listHead) {
		if(listHead == null || listHead.getListHeadId() == null) return null;
		try {
			ListHead lh = em.find(ListHead.class, listHead);
			if(lh == null) return null;
			lh.mapObject(listHead);
			em.merge(lh);
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
	public DataList updateDataList(DataList dataList) {
		if(dataList == null || dataList.getListId() == null) return null;
		try {
			DataList dl = em.find(DataList.class, dataList.getListId());
			if(dl == null) return null;
			dl.mapObject(dataList);
			em.merge(dl);
		} catch (Exception e) {
			log.error(ERROR_STRING, e.getMessage());
			return null;
		}
		return dataList;
	}

	@Override
	public ListHead findListHeadByListCode(String listCode) {
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
	public List<DataList> findDataListByListCode(String listCode) {
		StringBuilder dlSql = new StringBuilder("SELECT dl FROM DataList dl WHERE UPPER(dl.listCode)=:listCode");
		List<DataList> dlList = em.createQuery(dlSql.toString(), DataList.class).setParameter("listCode", listCode.trim().toUpperCase()).getResultList();
		if(dlList == null) return Collections.emptyList();
		return dlList;
	}

	@Override
	public DataList findDataListByListValue1(String listCode, String listValue1) {
		StringBuilder dlSql = new StringBuilder("SELECT dl FROM DataList dl WHERE UPPER(dl.listCode)=:listCode AND dl.listValue1=:listValue1");
		List<DataList> dlList = em.createQuery(dlSql.toString(), DataList.class)
									.setParameter("listCode", listCode.trim().toUpperCase())
									.setParameter("listValue1", listValue1).getResultList();
		if(dlList == null) return null;
		return dlList.stream().findFirst().orElse(null);
	}

	@Override
	public DataList findDataListByListValue1AndListValue2(String listCode, String listValue1, String listValue2) {
		StringBuilder dlSql = new StringBuilder("SELECT dl FROM DataList dl WHERE UPPER(dl.listCode)=:listCode AND dl.listValue1=:listValue1 AND dl.listValue2=:listValue2");
		List<DataList> dlList = em.createQuery(dlSql.toString(), DataList.class)
									.setParameter("listCode", listCode.trim().toUpperCase())
									.setParameter("listValue1", listValue1)
									.setParameter("listValue2", listValue2).getResultList();
		if(dlList == null) return null;
		return dlList.stream().findFirst().orElse(null);
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
