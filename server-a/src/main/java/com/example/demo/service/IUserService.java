package com.example.demo.service;


import com.example.demo.model.user.po.User;

/**
 * Created by chen on 2019/7/23.
 */
public interface IUserService {

    public int saveUser(User user,Integer flag);
}
