/**
 * 
 */
package com.codersknowledge.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codersknowledge.service.GenericService;

/**
 * @author Zubayer Ahamed
 *
 */
@Component
public abstract class AbstractGenericService <T, ID> implements GenericService<T, ID>{

	@Autowired @PersistenceContext protected EntityManager jpa;

	@Override
	@Transactional
	public T save(T obj) {
		if(obj == null) return null;
		jpa.persist(obj);
		return obj;
	}

	@Transactional
	@Override
	public T update(T obj) {
		if(obj == null) return null;
		jpa.merge(obj);
		return obj;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T archiveById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteById(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
