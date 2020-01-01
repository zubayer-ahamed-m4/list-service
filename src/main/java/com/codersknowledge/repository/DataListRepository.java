/**
 * 
 */
package com.codersknowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codersknowledge.entity.DataList;

/**
 * @author Zubayer Ahamed
 *
 */
@Repository
public interface DataListRepository extends JpaRepository<DataList, Long>{

}
