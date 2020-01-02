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
import org.springframework.web.bind.annotation.RestController;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;
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
		ListHead lh = new ListHead();
		lh.getDataLists().add(new DataList());
		return lh;
	}

	@PostMapping("/save")
	public ListHead saveList(@RequestBody ListHead listHead) {
		listHead = listService.saveListHead(listHead);
		return listHead != null ? listHead : new ListHead();
	}

	@PostMapping("/save/datalist")
	public DataList saveDataList(@RequestBody DataList dataList) {
		dataList = listService.saveDataList(dataList);
		return dataList != null ? dataList : new DataList();
	}

	@GetMapping("/find/listcode/{listCode}")
	public ListHead findByListCode(@PathVariable String listCode) {
		if(listCode == null || listCode.isEmpty()) return new ListHead();
		return listService.findListByListCode(listCode);
	}


}
