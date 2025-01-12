package com.hrv.alpha.controller.dto.common;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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


    public String getDescriptionByType(int type) {
        List<Status> statusArray =  Arrays.stream(Status.values()).toList();
        Optional<Status> state = statusArray.stream().filter(x-> x.type == type).findFirst();
        if(state.isPresent()){
            Status status = state.get();
            return status.getDescription();
        }
        return null;
    }

}
