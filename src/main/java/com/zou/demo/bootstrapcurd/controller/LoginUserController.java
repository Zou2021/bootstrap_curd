package com.zou.demo.bootstrapcurd.controller;

import com.zou.demo.bootstrapcurd.mapper.UserMapper;
import com.zou.demo.bootstrapcurd.model.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/5/31 16:16
 * 用户管理信息列表
 */
@Controller
public class LoginUserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/loginUser") //访问某url时
    public String loginU(Model model) {
        List<LoginUser> users = userMapper.selectLoginUser();
        model.addAttribute("users", users);//若不为空，写入域内
        return "loginUser";
    }
}
