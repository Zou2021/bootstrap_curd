package com.zou.demo.bootstrapcurd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zou.demo.bootstrapcurd.mapper.UserMapper;
import com.zou.demo.bootstrapcurd.model.User;
import org.springframework.stereotype.Service;

/**
 * @author：邹祥发
 * @date：2021/5/21
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
