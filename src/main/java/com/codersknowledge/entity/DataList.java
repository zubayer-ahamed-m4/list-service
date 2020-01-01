/**
 * 
 */
package com.codersknowledge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
@Entity
@Table(name = "datalist")
public class DataList implements Serializable {

	/**
	 * Generated Serial version UID
	 */
	private static final long serialVersionUID = -1077081327385642788L;

	@Id
	@Column(name = "listId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long listId;

	@Column(name = "listCode")
	private String listCode;

	@Column(name = "description")
	private String description;

	@Column(name = "listValue1")
	private String listValue1;
	@Column(name = "listValue2")
	private String listValue2;
	@Column(name = "listValue3")
	private String listValue3;
	@Column(name = "listValue4")
	private String listValue4;
	@Column(name = "listValue5")
	private String listValue5;
	@Column(name = "listValue6")
	private String listValue6;
	@Column(name = "listValue7")
	private String listValue7;
	@Column(name = "listValue8")
	private String listValue8;
	@Column(name = "listValue9")
	private String listValue9;
	@Column(name = "listValue10")
	private String listValue10;
	@Column(name = "listValue11")
	private String listValue11;
	@Column(name = "listValue12")
	private String listValue12;
	@Column(name = "listValue13")
	private String listValue13;
	@Column(name = "listValue14")
	private String listValue14;
	@Column(name = "listValue15")
	private String listValue15;
	@Column(name = "listValue16")
	private String listValue16;
	@Column(name = "listValue17")
	private String listValue17;
	@Column(name = "listValue18")
	private String listValue18;
	@Column(name = "listValue19")
	private String listValue19;
	@Column(name = "listValue20")
	private String listValue20;
	@Column(name = "listValue21")
	private String listValue21;
	@Column(name = "listValue22")
	private String listValue22;
}
