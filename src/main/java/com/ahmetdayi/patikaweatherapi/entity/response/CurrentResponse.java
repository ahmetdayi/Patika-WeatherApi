package com.ahmetdayi.patikaweatherapi.entity.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentResponse {

    @NotBlank
    private String Last_updated;

    @NotNull
    private ConditionResponse condition;
}
