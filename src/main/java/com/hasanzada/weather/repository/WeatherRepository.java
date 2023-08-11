package com.hasanzada.weather.repository;

import com.hasanzada.weather.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<WeatherEntity,String> {

}
