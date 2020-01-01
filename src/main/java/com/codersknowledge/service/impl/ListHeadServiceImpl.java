/**
 * 
 */
package com.codersknowledge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codersknowledge.entity.ListHead;
import com.codersknowledge.repository.ListHeadRepository;
import com.codersknowledge.service.ListHeadService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@Service
public class ListHeadServiceImpl extends AbstractGenericService<ListHead, Long> implements ListHeadService {


	@Autowired private ListHeadRepository listHeadRepository;

	@Override
	public ListHead findById(Long id) {
		return listHeadRepository.findById(id).get();
	}
	

}
