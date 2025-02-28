package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.AllCountryResponseDTO;
import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.service.CountryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CountryControllerTest {

    @Mock
    private CountryService countryService;
    @InjectMocks
    private CountryController countryController;

    @Test
    void testGetCountryList() {
        Country country = new Country();
        country.setCode("724");
        country.setName("Spain");

        List<Country> countryList = Collections.singletonList(country);
        when(countryService.getAllCountries()).thenReturn(countryList);

        ResponseEntity<AllCountryResponseDTO> response = countryController.getCountryList();
        assertEquals(HttpStatusCode.valueOf(200), response.getStatusCode());
        assertEquals(1, Objects.requireNonNull(response.getBody()).getCountries().size());
        assertEquals("Spain", response.getBody().getCountries().getFirst().getName());
    }
}