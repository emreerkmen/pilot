package com.repne.pilot.service;

import java.util.List;

import com.repne.pilot.model.Country;

/**
 * ICountiryService
 */
public interface ICountryService {

    public List<Country> getCountiry();
    public void setCountry(Country country);
    public int getLastIndex();
    
}