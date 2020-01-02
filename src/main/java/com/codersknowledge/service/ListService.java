/**
 * 
 */
package com.codersknowledge.service;

import com.codersknowledge.entity.DataList;
import com.codersknowledge.entity.ListHead;

/**
 * @author Zubayer Ahamed
 *
 */
public interface ListService {

	public ListHead saveListHead(ListHead listHead);

	public DataList saveDataList(DataList dataList);

	/**
	 * Find list by listcode
	 * 
	 * @param listCode
	 * @return {@link ListHead}
	 */
	public ListHead findListByListCode(String listCode);

	public boolean listValidate(ListHead listHead);
	public boolean listValidate(DataList dataList);
}
