package com.ahmetdayi.patikaweatherapi.service;

import com.ahmetdayi.patikaweatherapi.entity.response.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    public ResponseEntity<WeatherResponse> getWeatherDaily(String city) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-RapidAPI-Key", "16852c1d32mshdb133948d4e79d1p1388ccjsn3bda33358a9d");
        headers.set("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com");
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<WeatherResponse> exchange = restTemplate.exchange
                (
                        "https://weatherapi-com.p.rapidapi.com/forecast.json?q=" + city + "&days=14",
                        HttpMethod.GET,
                        requestEntity,
                        WeatherResponse.class
                );
        return exchange;

    }
    //diğerlerinin apisine ulaşamadım maalesef



}
