package com.hrv.alpha.service.impl;

import com.hrv.alpha.controller.dto.common.User;
import com.hrv.alpha.repository.UserRepository;
import com.hrv.alpha.service.UserService;
import com.hrv.alpha.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.toUserList(userRepository.findAll());
    }
}
