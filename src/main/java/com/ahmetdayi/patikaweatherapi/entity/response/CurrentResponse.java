package com.ahmetdayi.patikaweatherapi.entity.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentResponse {

    private String Last_updated;

    private ConditionResponse condition;
}
