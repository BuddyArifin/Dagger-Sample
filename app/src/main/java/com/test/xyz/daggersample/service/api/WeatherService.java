package com.test.xyz.daggersample.service.api;

import com.test.xyz.daggersample.service.exception.InvalidCityException;

public interface WeatherService {
    int getWeatherInfo(String city) throws InvalidCityException;
}
