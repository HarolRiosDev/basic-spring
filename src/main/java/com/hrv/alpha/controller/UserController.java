package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.FindUserResponseDTO;
import com.hrv.alpha.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;

    @RequestMapping(path = "/users/{user_id}")
    public ResponseEntity<FindUserResponseDTO> findUser (){
        return null;
    }

}
