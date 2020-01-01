/**
 * 
 */
package com.codersknowledge.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
@Entity
@Table(name = "listhead")
public class ListHead implements Serializable {

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 7189313798618994123L;

	@Id
	@Column(name = "listHeadId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long listHeadId;
	@Column(name = "listCode")
	private String listCode;
	@Column(name = "description")
	private String description;
	@Column(name = "note")
	private String note;

	@Column(name = "prompt1")
	private String prompt1;
	@Column(name = "prompt2")
	private String prompt2;
	@Column(name = "prompt3")
	private String prompt3;
	@Column(name = "prompt4")
	private String prompt4;
	@Column(name = "prompt5")
	private String prompt5;
	@Column(name = "prompt6")
	private String prompt6;
	@Column(name = "prompt7")
	private String prompt7;
	@Column(name = "prompt8")
	private String prompt8;
	@Column(name = "prompt9")
	private String prompt9;
	@Column(name = "prompt10")
	private String prompt10;
	@Column(name = "prompt11")
	private String prompt11;
	@Column(name = "prompt12")
	private String prompt12;
	@Column(name = "prompt13")
	private String prompt13;
	@Column(name = "prompt14")
	private String prompt14;
	@Column(name = "prompt15")
	private String prompt15;
	@Column(name = "prompt16")
	private String prompt16;

	@Transient
	private List<DataList> dataLists = new ArrayList<>();
}
