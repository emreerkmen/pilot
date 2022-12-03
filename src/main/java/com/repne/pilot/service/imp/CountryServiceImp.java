package com.repne.pilot.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repne.pilot.model.Country;
import com.repne.pilot.repository.CountryRepository;
import com.repne.pilot.service.ICountryService;

@Service
public class CountryServiceImp implements ICountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getCountiry() {
        List<Country> countries = (List<Country>) countryRepository.findAll();
        return countries;
    }

    @Override
    public void setCountry(Country country){
        countryRepository.save(country);
    }

    @Override
    public int getLastIndex(){
        Country country = countryRepository.findTopByOrderByIdDesc();
        return country.getId();
    }

}
