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

	/**
	 * Find list of DataList by listCode
	 * 
	 * @param listCode
	 * @return {@link List} of {@link DataList}
	 */
	public List<DataList> findListByCategory(String listCode);

	public boolean listValidate(ListHead listHead);
}
