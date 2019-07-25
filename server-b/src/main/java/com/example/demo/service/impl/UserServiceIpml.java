package com.example.demo.service.impl;

import com.example.demo.mapper.IUserMapper;
import com.example.demo.model.user.po.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2019/7/23.
 */
@Service
public class UserServiceIpml implements IUserService {

    @Autowired
    private IUserMapper userMapper;
    @Override
    @Transactional
    public int saveUser(User user) {
        userMapper.saveUser(user);
        return 1;
    }
}
