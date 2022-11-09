package com.repne.pilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PilotController
 */
@RestController
@RequestMapping(path = "pilot")
public class PilotController {

    @GetMapping
    public String getTest() {
        return "emre";
    }
}