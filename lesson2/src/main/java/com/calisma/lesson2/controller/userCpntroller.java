package com.calisma.lesson2.controller;

import com.calisma.lesson2.dto.User;
import com.calisma.lesson2.service.UserService;
import com.calisma.lesson2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //rest api yazdığımız için
@RequestMapping(path = "/api")
public class userCpntroller {
    @Autowired
    private UserService userService;
    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId)
    {
        return userService.getUserById(userId);
    }
}
