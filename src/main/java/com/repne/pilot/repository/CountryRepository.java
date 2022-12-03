package com.repne.pilot.repository;

import org.springframework.data.repository.CrudRepository;

import com.repne.pilot.model.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findTopByOrderByIdDesc();
    
}
