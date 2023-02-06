package com.ahmetdayi.patikaweatherapi.entity.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConditionResponse {

    @NotBlank
    private String text;
}
