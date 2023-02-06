package com.ahmetdayi.patikaweatherapi.entity.response;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {


@NotNull
private CurrentResponse current;


}
