package com.hrv.alpha.controller.dto;

import com.hrv.alpha.controller.dto.common.Country;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AllCountryResponseDTO {

    private List<Country> countries;
}
