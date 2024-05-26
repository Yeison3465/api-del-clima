package com.example.jary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.jary.models.WeatherResponse;

@Service
public class WeatherService {


    private String urlApi = "https://api.openweathermap.org/data/2.5/weather?q=Cartagena,CO&appid=c75fdf7c5e7cd7eb463edaac441ed452&units=metric";
    //https://api.openweathermap.org/data/2.5/weather?q=Cartagena,CO&appid=c75fdf7c5e7cd7eb463edaac441ed452&units=metric&lang=es
    @Autowired
    private RestTemplate restTemplate;

    public WeatherResponse getWeather(){
        WeatherResponse weather = restTemplate.getForObject(urlApi, WeatherResponse.class);


        return weather;
    }




}
