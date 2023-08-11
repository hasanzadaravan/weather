package com.hasanzada.weather.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "weather")
public class WeatherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String requestedCityname;
    private String city;
    private String country;
    private Integer tempurature;
    private LocalDateTime localDateTime;
    private LocalDateTime responseDatetime;
}
