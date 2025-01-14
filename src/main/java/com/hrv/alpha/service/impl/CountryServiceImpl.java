package com.hrv.alpha.service.impl;

import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.mapper.CountryMapper;
import com.hrv.alpha.repository.CountryRepository;
import com.hrv.alpha.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    //private CountryMapper countryMapper;

    @Override
    public List<Country> getAllCountries() {
        var countryList = countryRepository.findAll();
        return null;//countryMapper.toCountryList(countryList);
    }
}
