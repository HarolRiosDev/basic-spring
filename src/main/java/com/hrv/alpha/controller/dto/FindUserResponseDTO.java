package com.hrv.alpha.controller.dto;

import com.hrv.alpha.controller.dto.common.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FindUserResponseDTO {

    private User user;

}
