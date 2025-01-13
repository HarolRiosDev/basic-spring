package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.FindUserResponseDTO;
import com.hrv.alpha.controller.dto.GetCountryResponseDTO;
import com.hrv.alpha.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @RequestMapping(path = "/country")
    public ResponseEntity<GetCountryResponseDTO> getCountryList (){
        countryService.getAllCountries();
        return null;
    }
}
