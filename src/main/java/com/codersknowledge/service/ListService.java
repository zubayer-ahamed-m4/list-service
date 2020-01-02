/**
 * 
 */
package com.codersknowledge.service;

import java.util.List;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;

/**
 * @author Zubayer Ahamed
 *
 */
public interface ListService {

	public ListHead saveListHead(ListHead listHead);
	public ListHead updateListHead(ListHead listHead);

	public DataList saveDataList(DataList dataList);
	public DataList updateDataList(DataList dataList);
	/**
	 * Find list by listcode
	 * 
	 * @param listCode
	 * @return {@link ListHead}
	 */
	public ListHead findListHeadByListCode(String listCode);
	public List<DataList> findDataListByListCode(String listCode);
	public DataList findDataListByListValue1(String listCode, String listValue1);
	public DataList findDataListByListValue1AndListValue2(String listCode, String listValue1, String listValue2);

	public boolean listValidate(ListHead listHead);
	public boolean listValidate(DataList dataList);
}
