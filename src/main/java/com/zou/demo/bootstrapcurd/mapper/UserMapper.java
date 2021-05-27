package com.zou.demo.bootstrapcurd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zou.demo.bootstrapcurd.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * @author：邹祥发
 * @date：2021/5/21
 **/
public interface UserMapper extends BaseMapper<User> {
    @Select("select username from tb_user where username = #{username}")
    String selectName(String username);

    @Select("select password from tb_user where username = #{username}")
    String selectPwdByName(String username);

    @Insert("INSERT INTO `tb_user` (username,password) VALUES (#{username},#{password})")
    void registerUser(String username,String password);
}
