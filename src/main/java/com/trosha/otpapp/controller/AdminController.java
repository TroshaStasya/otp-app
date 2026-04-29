package com.trosha.otpapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(
            value = "/changeConfiguration",
            method = GET
    )
    public String changeConfiguration() {
        return "The configuration is changed";
    }

    @RequestMapping(
            value = "/user/list",
            method = GET
    )
    public String userList() {
        return "The list of users is made";
    }

    @RequestMapping(
            value = "/user/delete",
            method = GET
    )
    public String userDelete() {
        return "The user is deleted";
    }

}
