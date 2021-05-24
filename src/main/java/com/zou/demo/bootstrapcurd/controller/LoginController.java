package com.zou.demo.bootstrapcurd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 邹祥发
 * @date: 2021/5/23 10:28
 */
@RequestMapping("/login")
@Controller
public class LoginController {

    @RequestMapping
    public String login() {
        return "login";
    }
}
