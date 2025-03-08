package com.hrv.alpha.service.impl;

import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.repository.CountryRepository;
import com.hrv.alpha.service.CountryService;
import com.hrv.alpha.service.mapper.CountryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    private final CountryMapper countryMapper;

    @Override
    public List<Country> getAllCountries() {
        return countryMapper.toCountryList(countryRepository.findAll());
    }
}
