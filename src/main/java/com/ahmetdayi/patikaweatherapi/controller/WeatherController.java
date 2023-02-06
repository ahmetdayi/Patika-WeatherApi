package com.ahmetdayi.patikaweatherapi.controller;

import com.ahmetdayi.patikaweatherapi.entity.response.WeatherResponse;
import com.ahmetdayi.patikaweatherapi.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public ResponseEntity<WeatherResponse> getWeatherDaily(@RequestParam("city") String city){
        return weatherService.getWeatherDaily(city);
    }

}
