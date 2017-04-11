/**
 * 
 */
package com.example.hwmanage.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.hwmanage.models.MFloor;

/**
 * @author saitoshu
 *
 */
public interface MFloorReppository extends CrudRepository<MFloor, Integer> {
	Iterable<MFloor> findByFloorName(String floorName);
	}
