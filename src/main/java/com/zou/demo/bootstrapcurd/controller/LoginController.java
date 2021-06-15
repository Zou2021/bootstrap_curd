package com.zou.demo.bootstrapcurd.controller;

import com.zou.demo.bootstrapcurd.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author: 邹祥发
 * @date: 2021/5/23 10:28
 */
@Controller
public class LoginController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login() {
        return "login";
    }

    //简单登录验证
    @RequestMapping(value = "/check",method = {RequestMethod.POST})
    public String login(@RequestParam("loginName") String
                                loginName,
                        @RequestParam("loginPwd") String loginPwd,
                        @RequestParam("code") String code,
                        Model model, HttpSession session) {
        //用户名存在
        if (userMapper.selectName(loginName) != null) {
            //密码正确
            if (userMapper.selectPwdByName(loginName).equals(loginPwd)) {
                //从session中获取随机数
                String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
                if (random != null && !"".equals(random) && random.equalsIgnoreCase(code)) {
                    session.setAttribute("loginUser", loginName);

                    return "index";
                } else {
                    model.addAttribute("msg", "验证码错误");
                    return "login";
                }
            } else {
                model.addAttribute("msg", "密码错误");
                return "login";
            }
        } else {
            model.addAttribute("msg", "用户名不存在，请注册");
            return "login";
        }
    }
}
