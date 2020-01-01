/**
 * 
 */
package com.codersknowledge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.repository.DataListRepository;
import com.codersknowledge.service.DataListService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@Service
public class DataListServiceImpl extends AbstractGenericService<DataList, Long> implements DataListService {


	@Autowired private DataListRepository dataListRepository;

	@Override
	public DataList findById(Long id) {
		return dataListRepository.findById(id).get();
	}

	@Override
	public List<DataList> findAll() {
		return dataListRepository.findAll();
	}
	

}
