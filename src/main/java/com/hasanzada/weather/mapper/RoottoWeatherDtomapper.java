package com.hasanzada.weather.mapper;

import com.hasanzada.weather.dto.WeatherDto;
import com.hasanzada.weather.model.Root;

public class RoottoWeatherDtomapper {

    public static WeatherDto fromRootToWeatherDto(Root from){

        return new WeatherDto(from.location.name,from.location.country,from.current.temperature);
    }
}
