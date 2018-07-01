package com.kevin.springclouduserservice.controllers;

import com.kevin.springclouduserservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/config/{conf}",method = RequestMethod.GET)
    public String getConfig(@PathVariable("conf") String conf) {
        return userService.getConifg() + ":"+conf;

    }

}
