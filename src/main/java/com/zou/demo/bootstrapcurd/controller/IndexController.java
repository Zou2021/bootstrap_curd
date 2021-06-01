package com.zou.demo.bootstrapcurd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author：邹祥发
 * @date：2021/5/21
 * 进入主页需先登录
 **/
@RequestMapping
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "login";
    }
}
