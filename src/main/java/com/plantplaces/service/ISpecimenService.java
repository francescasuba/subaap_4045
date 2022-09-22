package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;



/**
 * CRUD operations for specimens
 *
 */
public interface ISpecimenService {
	
	/**
	 * Get specimens from persistence layer
	 *@param id a unique lookup
	 *@return a specimen with a matching id
	 *
	 */

	SpecimenDTO fetchById(int id);
	
	/**
	 * Persists the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}