package com.hrv.alpha.service.impl;

import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {
    @Override
    public List<Country> getAllCountries() {
        return List.of();
    }
}
