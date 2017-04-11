package com.example.hwmanage.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the m_hwc database table.
 * 
 */
@Entity
@Table(name="m_hwc")
@NamedQuery(name="MHwc.findAll", query="SELECT m FROM MHwc m")
public class MHwc implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@Column(name="hwc_cd")
	private Long hwcCd;

	@Column(name="hwc_name")
	private String hwcName;

	@Column(name="note_1_name")
	private String note1Name;

	@Column(name="note_2_name")
	private String note2Name;

	@Column(name="note_3_name")
	private String note3Name;

	@Column(name="note_4_name")
	private String note4Name;

	@Column(name="note_5_name")
	private String note5Name;

	public MHwc() {
	}

	public Long getHwcCd() {
		return this.hwcCd;
	}

	public void setHwcCd(Long hwcCd) {
		this.hwcCd = hwcCd;
	}

	public String getHwcName() {
		return this.hwcName;
	}

	public void setHwcName(String hwcName) {
		this.hwcName = hwcName;
	}

	public String getNote1Name() {
		return this.note1Name;
	}

	public void setNote1Name(String note1Name) {
		this.note1Name = note1Name;
	}

	public String getNote2Name() {
		return this.note2Name;
	}

	public void setNote2Name(String note2Name) {
		this.note2Name = note2Name;
	}

	public String getNote3Name() {
		return this.note3Name;
	}

	public void setNote3Name(String note3Name) {
		this.note3Name = note3Name;
	}

	public String getNote4Name() {
		return this.note4Name;
	}

	public void setNote4Name(String note4Name) {
		this.note4Name = note4Name;
	}

	public String getNote5Name() {
		return this.note5Name;
	}

	public void setNote5Name(String note5Name) {
		this.note5Name = note5Name;
	}

}