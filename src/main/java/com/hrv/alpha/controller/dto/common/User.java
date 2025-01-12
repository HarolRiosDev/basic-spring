package com.hrv.alpha.controller.dto.common;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    private String name;

    private String lastName;

    private Status status;

    private Country country;

}
