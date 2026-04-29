package com.trosha.otpapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(
        value = "/registr",
        method = GET
    )
    public String registr() {
        return "You are registrated";
    }

    @RequestMapping(
            value = "/login",
            method = GET
    )
    public String login() {
        return "You are login";
    }

    @RequestMapping(
            value = "/otp/generate",
            method = GET
    )
    public String otpGenerate() {
        return "OTP-code is generated";
    }

    @RequestMapping(
            value = "/otp/validate",
            method = GET
    )
    public String otpValidate() {
        return "OTP-code is validated";
    }

}
