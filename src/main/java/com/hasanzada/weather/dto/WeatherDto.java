package com.hasanzada.weather.dto;

public class WeatherDto {
    private String city;
    private String country;
    private Integer temperature;


    public WeatherDto() {
    }

    @Override
    public String toString() {
        return "WeatherDto{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    public WeatherDto(String city, String country, Integer temperature) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}
