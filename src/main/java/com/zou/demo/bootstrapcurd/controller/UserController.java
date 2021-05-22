package com.zou.demo.bootstrapcurd.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zou.demo.bootstrapcurd.common.Result;
import com.zou.demo.bootstrapcurd.common.ResultUtil;
import com.zou.demo.bootstrapcurd.model.User;
import com.zou.demo.bootstrapcurd.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author：邹祥发
 * @date：2021/5/21
 **/
@RequestMapping("/user")
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping
    public String user(){
        return "user";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Result<User> get(@PathVariable Integer id){
        User user =  userService.getById(id);

        return ResultUtil.ok(user);
    }

    /**
     *  分页查询
     */
    @PostMapping("/list")
    @ResponseBody
    public Result<IPage<User>> list(@RequestParam(value = "username", required = false) String username,
                             @RequestParam(defaultValue = "1") Integer pageNo,
                             @RequestParam(defaultValue = "10") Integer pageSize){
        // 构造查询条件
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(username)){
            queryWrapper.like("username",username);
            queryWrapper.orderByDesc("create_time");
        }
        Page<User> page = new Page<>(pageNo,pageSize);

        IPage<User> result = userService.page(page, queryWrapper);
        // 设置总记录数
        result.setTotal(userService.count(queryWrapper));

        return ResultUtil.ok(result);
    }

    @PostMapping("/add")
    @ResponseBody
    public Result<String> add(@RequestBody User user){
        userService.save(user);

        return ResultUtil.ok("添加成功！");
    }

    @PostMapping("/modify")
    @ResponseBody
    public Result<String> modify(@RequestBody User user){
        userService.saveOrUpdate(user);

        return ResultUtil.ok("修改成功！");
    }

    @PostMapping("/remove")
    @ResponseBody
    public Result<String> remove(@RequestParam Integer id){
        userService.removeById(id);

        return ResultUtil.ok("删除成功！");
    }
}
