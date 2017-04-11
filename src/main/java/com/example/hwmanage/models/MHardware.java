package com.example.hwmanage.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the m_hardware database table.
 * 
 */
@Entity
@Table(name="m_hardware")
@NamedQuery(name="MHardware.findAll", query="SELECT m FROM MHardware m")
public class MHardware implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hardware_cd")
	private Long hardwareCd;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="hardware_category")
	private BigDecimal hardwareCategory;

	@Column(name="hardware_name")
	private String hardwareName;

	@Column(name="note_1")
	private String note1;

	@Column(name="note_2")
	private String note2;

	@Column(name="note_3")
	private String note3;

	@Column(name="note_4")
	private String note4;

	@Column(name="note_5")
	private String note5;

	@Column(name="update_date")
	private Timestamp updateDate;

	public MHardware() {
	}

	public Long getHardwareCd() {
		return this.hardwareCd;
	}

	public void setHardwareCd(Long hardwareCd) {
		this.hardwareCd = hardwareCd;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getHardwareCategory() {
		return this.hardwareCategory;
	}

	public void setHardwareCategory(BigDecimal hardwareCategory) {
		this.hardwareCategory = hardwareCategory;
	}

	public String getHardwareName() {
		return this.hardwareName;
	}

	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	public String getNote1() {
		return this.note1;
	}

	public void setNote1(String note1) {
		this.note1 = note1;
	}

	public String getNote2() {
		return this.note2;
	}

	public void setNote2(String note2) {
		this.note2 = note2;
	}

	public String getNote3() {
		return this.note3;
	}

	public void setNote3(String note3) {
		this.note3 = note3;
	}

	public String getNote4() {
		return this.note4;
	}

	public void setNote4(String note4) {
		this.note4 = note4;
	}

	public String getNote5() {
		return this.note5;
	}

	public void setNote5(String note5) {
		this.note5 = note5;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}