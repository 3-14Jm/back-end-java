package com.fox.controller;

import com.fox.DTO.UserDTO;
import com.fox.domain.User;
import com.fox.mapper.AbstractMapper;
import com.fox.mapper.UserMapper;
import com.fox.service.AbstractService;
import com.fox.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/users")
@RestController
@AllArgsConstructor
public class UserController extends AbstractController<User, UserDTO, Integer> {
    private final UserService userService;
    private final UserMapper userMapper;


    @Override
    protected AbstractService<User, Integer> getService() {
        return userService;
    }

    @Override
    protected AbstractMapper<User, UserDTO> getMapper() {
        return userMapper;
    }
}

