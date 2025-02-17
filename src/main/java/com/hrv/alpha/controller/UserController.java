package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.AllUserResponseDTO;
import com.hrv.alpha.controller.dto.common.User;
import com.hrv.alpha.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping(path = "/users")
    public ResponseEntity<AllUserResponseDTO> getUserList (){
        List<User> list = userService.getAllUsers();
        AllUserResponseDTO response = AllUserResponseDTO.builder().user(list).build();
        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

}
