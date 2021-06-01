package com.zou.demo.bootstrapcurd.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: 邹祥发
 * @date: 2021/5/31 17:06
 */
@Data
@TableName("login_user")
public class LoginUser {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String loginName;
    private String loginPwd;
}
