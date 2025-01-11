package com.hrv.alpha.controller;

import com.hrv.alpha.service.HomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

    private HomeService homeService;


}
