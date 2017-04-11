/**
 * 
 */
package com.example.hwmanage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

/**
 * @author saitoshu
 *
 */
@Entity
@Table(name="M_FLOOR")
public class MFloor {

	@Id
	@NotNull
	@Column(name="floor_cd")
	protected Integer floorCd;

	@NotNull
	@Size(max=40)
	@Column(name="floor_name")
	protected String floorName;

	public Integer getFloorCd() {
		return floorCd;
	}

	public void setFloorCd(Integer floorCd) {
		this.floorCd = floorCd;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	
	
}
