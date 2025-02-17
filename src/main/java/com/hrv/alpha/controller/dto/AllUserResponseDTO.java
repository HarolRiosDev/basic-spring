package com.hrv.alpha.controller.dto;

import com.hrv.alpha.controller.dto.common.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AllUserResponseDTO {

    private List<User> user;

}
