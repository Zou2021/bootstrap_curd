package com.zou.demo.bootstrapcurd.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @author：邹祥发
 * @date：2021/5/21
 **/
@Data
@TableName("tb_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String truename;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 修改人
     */
    private String updateUser;

}
