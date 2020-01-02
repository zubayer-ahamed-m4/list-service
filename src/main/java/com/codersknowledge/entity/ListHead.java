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

import com.codersknowledge.model.AbstractModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zubayer Ahamed
 *
 */
@Data
@Entity
@Table(name = "listhead")
@EqualsAndHashCode(of = {"listHeadId"}, callSuper = false)
public class ListHead extends AbstractModel implements Serializable {

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

	public ListHead mapObject(ListHead listHead) {
		this.listHeadId = listHead.getListHeadId();
		this.listCode = listHead.getListCode();
		this.description = listHead.getDescription();
		this.note = listHead.getNote();
		this.prompt1 = listHead.getPrompt1();
		this.prompt2 = listHead.getPrompt2();
		this.prompt3 = listHead.getPrompt3();
		this.prompt4 = listHead.getPrompt4();
		this.prompt5 = listHead.getPrompt5();
		this.prompt6 = listHead.getPrompt6();
		this.prompt7 = listHead.getPrompt7();
		this.prompt8 = listHead.getPrompt8();
		this.prompt9 = listHead.getPrompt9();
		this.prompt10 = listHead.getPrompt10();
		this.prompt11 = listHead.getPrompt11();
		this.prompt12 = listHead.getPrompt12();
		this.prompt13 = listHead.getPrompt13();
		this.prompt14 = listHead.getPrompt14();
		this.prompt15 = listHead.getPrompt15();
		this.prompt16 = listHead.getPrompt16();
		return this;
	}

	@Transient
	private List<DataList> dataLists = new ArrayList<>();
}
