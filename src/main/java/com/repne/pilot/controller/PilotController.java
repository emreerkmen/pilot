package com.repne.pilot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.repne.pilot.model.Country;
import com.repne.pilot.service.ICountryService;

/**
 * PilotController
 */
@RestController
@RequestMapping(path = "pilot")
public class PilotController {

    @Autowired
    ICountryService iCountryService;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping
    public List<Country> getTest() {
        return iCountryService.getCountiry();
    }

    @PostMapping
    public void setCountry(@RequestParam(name = "country") String country) {
        Country newCountry = new Country();
        int index = iCountryService.getLastIndex();
        System.out.println("index: "+index);
        newCountry.setName(country);
        newCountry.setId(index+1);
        iCountryService.setCountry(newCountry);
        kafkaTemplate.send("topic-country", newCountry);
    }
}