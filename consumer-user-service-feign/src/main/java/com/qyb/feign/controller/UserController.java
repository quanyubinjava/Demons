package com.qyb.feign.controller;


import com.qyb.feign.pojo.User;
import com.qyb.feign.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("getUserById")
    public User getUserById(@RequestParam("id") Integer id) {
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("buyTicket")
    public Map<String, Object> buyTicket(@RequestParam("id") Integer userId) {
        Map<String, Object> map = userService.buyMovie(userId);
        return map;
    }
}
