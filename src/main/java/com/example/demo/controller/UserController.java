package com.example.demo.controller;

import com.example.demo.controller.common.AbstractController;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractController<User, UserService> {

    public UserController(UserService service) {
        super(service);
    }
}