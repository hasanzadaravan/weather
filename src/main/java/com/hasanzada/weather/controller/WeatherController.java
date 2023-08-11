package com.hasanzada.weather.controller;

import com.hasanzada.weather.dto.WeatherDto;
import com.hasanzada.weather.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/open-weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public ResponseEntity<WeatherDto> getWeather() {


        return ResponseEntity.ok(weatherService.getWeather());
    }
}
