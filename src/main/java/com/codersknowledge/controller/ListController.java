/**
 * 
 */
package com.codersknowledge.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;
import com.codersknowledge.service.ListService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Zubayer Ahamed
 *
 */
@Slf4j
@RestController
@RequestMapping("/rest/list")
@Api(value = "List service rest endpoint", description = "List service operations")
public class ListController {

	@Autowired private ListService listService;

	@GetMapping
	public ListHead getObjectSample() {
		ListHead lh = new ListHead();
		lh.getDataLists().add(new DataList());
		return lh;
	}

	@ApiOperation(value = "Save listhead")
	@PostMapping("/save/listhead")
	public ListHead saveListHead(@RequestBody ListHead listHead) {
		listHead = listService.saveListHead(listHead);
		return listHead != null ? listHead : new ListHead();
	}

	@ApiOperation(value = "Update listhead")
	@PutMapping("/update/listhead")
	public ListHead updateListHead(@RequestBody ListHead listHead) {
		listHead = listService.updateListHead(listHead);
		return listHead != null ? listHead : new ListHead();
	}

	@ApiOperation(value = "Save datalist")
	@PostMapping("/save/datalist")
	public DataList saveDataList(@RequestBody DataList dataList) {
		dataList = listService.saveDataList(dataList);
		return dataList != null ? dataList : new DataList();
	}

	@ApiOperation(value = "Update datalist")
	@PutMapping("/update/datalist")
	public DataList updateDataList(@RequestBody DataList dataList) {
		dataList = listService.updateDataList(dataList);
		return dataList != null ? dataList : new DataList();
	}

	@ApiOperation(value = "Get listhead by listcode")
	@GetMapping("/find/listhead/{listCode}")
	public ListHead findListHeadByListCode(@PathVariable String listCode) {
		if(listCode == null || listCode.isEmpty()) return new ListHead();
		return listService.findListHeadByListCode(listCode);
	}

	@ApiOperation(value = "Get list of datalist by listcode")
	@GetMapping("/find/datalist/{listCode}")
	public List<DataList> findDataListByListCode(@PathVariable String listCode) {
		if(listCode == null || listCode.isEmpty()) return Collections.emptyList();
		return listService.findDataListByListCode(listCode);
	}

	@ApiOperation(value = "Get datalist by listvalue1")
	@GetMapping("/find/datalist/{listCode}/{listValue1}")
	public DataList findDataListByListValue1(@PathVariable String listCode, @PathVariable String listValue1) {
		if(listCode == null || listCode.isEmpty()) return null;
		return listService.findDataListByListValue1(listCode, listValue1);
	}

	@ApiOperation(value = "Get datalist by listvalue1 and listvalue2")
	@GetMapping("/find/datalist/{listCode}/{listValue1}/{listValue2}")
	public DataList findDataListByListValue1(@PathVariable String listCode, @PathVariable String listValue1, @PathVariable String listValue2) {
		if(listCode == null || listCode.isEmpty()) return null;
		return listService.findDataListByListValue1AndListValue2(listCode, listValue1, listValue2);
	}

}
