package com.hasanzada.weather.service;

import com.hasanzada.weather.dto.WeatherDto;
import com.hasanzada.weather.mapper.RoottoWeatherDtomapper;
import com.hasanzada.weather.model.Root;
import com.hasanzada.weather.model.WeatherEntity;
import com.hasanzada.weather.repository.WeatherRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;
    private final RestTemplate restTemplate;
    final String ROOT_URI = "http://api.weatherstack.com/current?access_key=7de6d4a2994d59386fc8a3524632235e&query=New%20York";

    public WeatherService(WeatherRepository weatherRepository, RestTemplate restTemplate) {
        this.weatherRepository = weatherRepository;
        this.restTemplate = restTemplate;
    }

    public WeatherDto getWeather() {

        ResponseEntity<Root> responseEntity = restTemplate.getForEntity(ROOT_URI, Root.class);

        return RoottoWeatherDtomapper.fromRootToWeatherDto(responseEntity.getBody());
    }


}
