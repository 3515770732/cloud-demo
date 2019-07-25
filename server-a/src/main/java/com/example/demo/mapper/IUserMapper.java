package com.example.demo.mapper;


import com.example.demo.model.user.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chen on 2019/7/23.
 */
@Mapper
public interface IUserMapper {

    @Insert("insert into t_user (name) VALUES" +
            "(#{name})")
    public int saveUser(User user);
}
