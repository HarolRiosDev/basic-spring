package com.hrv.alpha.controller.dto.common;

import lombok.Getter;

import java.util.Arrays;
@Getter
public enum Status {
    SINGLE(1, "SINGLE"),
    MARRIED(2, "MARRIED"),
    DIVORCED(3, "DIVORCED"),
    SEPARATED_IN_PROCESS(4, "SEPARATED_IN_PROCESS");

    private final int type;
    private final String description;

    Status(int type, String description) {
        this.type  = type;
        this.description = description;
    }


    public static Status getStatusByType(int type) {
        return Arrays.stream(Status.values())
                .filter(status -> status.getType() == type)
                .findFirst()
                .orElse(null);
    }

}
