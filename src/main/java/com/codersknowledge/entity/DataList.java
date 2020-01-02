package com.codersknowledge.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.codersknowledge.model.AbstractModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
@Entity
@Table(name = "datalist")
@EqualsAndHashCode(of = {"listId"}, callSuper = false)
public class DataList extends AbstractModel implements Serializable {

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

	public DataList mapObject(DataList dataList) {
		this.listId = dataList.getListId();
		this.listCode = dataList.getListCode();
		this.description = dataList.getDescription();
		this.listValue1 = dataList.getListValue1();
		this.listValue2 = dataList.getListValue2();
		this.listValue3 = dataList.getListValue3();
		this.listValue4 = dataList.getListValue4();
		this.listValue5 = dataList.getListValue5();
		this.listValue6 = dataList.getListValue6();
		this.listValue7 = dataList.getListValue7();
		this.listValue8 = dataList.getListValue8();
		this.listValue9 = dataList.getListValue9();
		this.listValue10 = dataList.getListValue10();
		this.listValue11 = dataList.getListValue11();
		this.listValue12 = dataList.getListValue12();
		this.listValue13 = dataList.getListValue13();
		this.listValue14 = dataList.getListValue14();
		this.listValue15 = dataList.getListValue15();
		this.listValue16 = dataList.getListValue16();
		this.listValue17 = dataList.getListValue17();
		this.listValue18 = dataList.getListValue18();
		this.listValue19 = dataList.getListValue19();
		this.listValue20 = dataList.getListValue20();
		this.listValue21 = dataList.getListValue21();
		this.listValue22 = dataList.getListValue22();
		return this;
	}
}
