/**
 * 
 */
package com.codersknowledge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codersknowledge.entity.ListHead;

/**
 * @author Zubayer Ahamed
 *
 */
@Repository
public interface ListHeadRepository extends JpaRepository<ListHead, Long>{

}
