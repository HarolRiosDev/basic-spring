package com.hrv.alpha.service.impl;

import com.hrv.alpha.controller.dto.common.User;
import com.hrv.alpha.mapper.UserMapper;
import com.hrv.alpha.repository.UserRepository;
import com.hrv.alpha.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.toUserList(userRepository.findAll());
    }
}
