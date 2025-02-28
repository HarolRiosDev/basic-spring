package com.hrv.alpha.controller.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;

    private String lastName;

    private Status status;

    private Country country;

}
