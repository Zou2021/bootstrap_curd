package com.zou.demo.bootstrapcurd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zou.demo.bootstrapcurd.model.LoginUser;
import com.zou.demo.bootstrapcurd.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author：邹祥发
 * @date：2021/5/21
 **/
public interface UserMapper extends BaseMapper<User> {
    @Select("select loginName from login_user where loginName = #{loginName}")
    String selectName(String loginName);

    @Select("select loginPwd from login_user where loginName = #{loginName}")
    String selectPwdByName(String loginName);

    @Insert("INSERT INTO `login_user` (loginName,loginPwd) VALUES (#{loginName},#{loginPwd})")
    void registerUser(String loginName,String loginPwd);

    @Select("select * from login_user")
    List<LoginUser> selectLoginUser();
}
