package com.github.mapper;

import com.github.bean.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select id,username,email,gender from user where id = #{id}")
    User getUserInfo(Integer id);
}
