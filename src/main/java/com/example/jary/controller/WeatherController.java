package com.example.jary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jary.models.WeatherResponse;
import com.example.jary.service.WeatherService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http:/localhost:8000")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeather(){
        return weatherService.getWeather();
    }
}
