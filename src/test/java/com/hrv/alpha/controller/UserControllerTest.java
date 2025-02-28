package com.hrv.alpha.controller;

import com.hrv.alpha.controller.dto.AllUserResponseDTO;
import com.hrv.alpha.controller.dto.common.Country;
import com.hrv.alpha.controller.dto.common.Status;
import com.hrv.alpha.controller.dto.common.User;
import com.hrv.alpha.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;
    @InjectMocks
    private UserController userController;

    @Test
    void testGetUserList() {
        User user = new User();
        user.setCountry(Country.builder().code("724").name("Spain").build());
        user.setName("John");
        user.setLastName("Doe");
        user.setStatus(Status.DIVORCED);

        List<User> userList = Collections.singletonList(user);
        when(userService.getAllUsers()).thenReturn(userList);

        ResponseEntity<AllUserResponseDTO> response = userController.getUserList();
        assertEquals(HttpStatusCode.valueOf(200), response.getStatusCode());
        assertEquals(1, Objects.requireNonNull(response.getBody()).getUser().size());
        assertEquals("John", response.getBody().getUser().getFirst().getName());
    }
}