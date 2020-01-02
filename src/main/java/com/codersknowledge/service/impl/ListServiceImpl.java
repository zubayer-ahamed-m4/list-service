/**
 * 
 */
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

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public ListHead saveListHead(ListHead listHead) {
		try {
			em.persist(listHead);
		} catch (Exception e) {
			log.error("Error : {}", e.getMessage());
			return null;
		}
		return listHead;
	}

	@Override
	public List<DataList> findListByCategory(String listCode) {
		StringBuilder sql = new StringBuilder("SELECT dl FROM ");
		return Collections.emptyList();
	}

	@Override
	public boolean listValidate(ListHead listHead) {
		// TODO Auto-generated method stub
		return false;
	}


}
