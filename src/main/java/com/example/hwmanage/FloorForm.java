/**
 * 
 */
package com.example.hwmanage;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author saitoshu
 *
 */
public class FloorForm implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	protected int floorCd;
	@NotNull
	@Size(max=40)
	protected String floorName;

	public int getFloorCd() {
		return floorCd;
	}

	public void setFloorCd(int floorCd) {
		this.floorCd = floorCd;
	}

	public String getFloorName() {
		return floorName;
	}

	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}

	
}
