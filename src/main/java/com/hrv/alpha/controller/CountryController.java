package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.FindUserResponseDTO;
import com.hrv.alpha.service.CountryService;
import com.hrv.alpha.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @RequestMapping(path = "/country")
    public ResponseEntity<FindUserResponseDTO> getCountryList (){
        return null;
    }
}
