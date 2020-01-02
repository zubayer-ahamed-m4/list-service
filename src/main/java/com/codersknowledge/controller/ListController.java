/**
 * 
 */
package com.codersknowledge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;
import com.codersknowledge.model.dto.ListHeadDTO;
import com.codersknowledge.service.ListService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@RestController
@RequestMapping("/list")
public class ListController {

	@Autowired private ListService listService;

	@GetMapping
	public ListHead getObjectSample() {
		return new ListHead();
	}

	@PostMapping("/save")
	public ListHead saveList(@RequestBody ListHead listHead) {
		listHead = listService.saveListHead(listHead);
		return listHead;
	}

	@GetMapping("/{listId}")
	public DataList getListById(@PathVariable("listId") Long listId) {
		log.info("Getting list by list id ..... {}", listId);
		listService.findListByCategory("");
		return new DataList();
	}

}
