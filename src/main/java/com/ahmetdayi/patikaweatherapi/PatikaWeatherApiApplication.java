package com.ahmetdayi.patikaweatherapi;

import com.ahmetdayi.patikaweatherapi.core.exception.RestTemplateResponseErrorHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RequiredArgsConstructor
public class PatikaWeatherApiApplication {

	private final RestTemplateResponseErrorHandler responseErrorHandler;
	public static void main(String[] args) {
		SpringApplication.run(PatikaWeatherApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplateBuilder().errorHandler(responseErrorHandler).build();
	}
}
