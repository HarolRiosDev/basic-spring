package com.hrv.alpha.service;

import com.hrv.alpha.repository.CountryRepository;
import com.hrv.alpha.service.impl.CountryServiceImpl;
import com.hrv.alpha.service.mapper.CountryMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class CountryServiceTest {

    @InjectMocks
    private CountryServiceImpl countryService;
    @Mock
    private CountryRepository countryRepository;
    @Mock
    private CountryMapper countryMapper;


    @Test
    void testGetAllCountries() {
        when(countryRepository.findAll()).thenReturn(Collections.emptyList());
        var response = countryService.getAllCountries();
        assertThat(response).isEmpty();
    }
}
