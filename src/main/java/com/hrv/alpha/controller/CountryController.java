package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.AllCountryResponseDTO;
import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private CountryService countryService;

    @GetMapping(path = "/country")
    public ResponseEntity<AllCountryResponseDTO> getCountryList (){
        List<Country> list = countryService.getAllCountries();
        AllCountryResponseDTO response = AllCountryResponseDTO.builder().countries(list).build();
        return ResponseEntity.ok(response);
    }
}
