package com.zou.demo.bootstrapcurd.controller;

import com.zou.demo.bootstrapcurd.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author: 邹祥发
 * @date: 2021/5/27 09:22
 */
@Controller
public class RegisterController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    //简单注册验证
    @PostMapping("/checkPwd")
    public String login(@RequestParam("loginName") String loginName,
                        @RequestParam("loginPwd") String loginPwd,
                        @RequestParam("rePassword") String rePassword,
                        Model model) {
        //用户名不存在
        if (userMapper.selectName(loginName) == null) {
            //两次输入密码是否一致
            if (loginPwd.equals(rePassword)) {
                userMapper.registerUser(loginName, loginPwd);
//                model.addAttribute("msg", "注册成功！请登录");
                return "login";

            } else {
                model.addAttribute("msg", "两次输入的密码不一致！");
            }
        }
        //用户名已经存在
        else {
            model.addAttribute("msg", "用户名已存在！");
        }
        return "register";
    }
}