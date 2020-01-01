/**
 * 
 */
package com.codersknowledge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.service.DataListService;
import com.codersknowledge.service.ListHeadService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@RestController
@RequestMapping("/list")
public class ListController {

	@Autowired private ListHeadService listHeadService;
	@Autowired private DataListService dataListService;

	@GetMapping
	public String sayHello() {
		return "Welcome to list micro-service";
	}

	@GetMapping("/{listId}")
	public DataList getListById(@PathVariable("listId") Long listId) {
		log.info("Getting list by list id ..... {}", listId);
		return new DataList();
	}

}
