package com.example.hwmanage.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the m_floor database table.
 * 
 */
@Entity
@Table(name="m_floor")
@NamedQuery(name="MFloor.findAll", query="SELECT m FROM MFloor m")
public class MFloor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="floor_cd")
	private Long floorCd;

	@Column(name="floor_name")
	private String floorName;

	public MFloor() {
	}

	public Long getFloorCd() {
		return this.floorCd;
	}

	public void setFloorCd(Long floorCd) {
		this.floorCd = floorCd;
	}

	public String getFloorName() {
		return this.floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

}