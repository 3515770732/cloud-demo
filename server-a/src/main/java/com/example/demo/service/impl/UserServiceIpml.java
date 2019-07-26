package com.example.demo.service.impl;

import com.example.demo.feign.ServerBFeign;
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
    @Autowired
    private ServerBFeign serverBFeign;
    @Override
    @Transactional
    public int saveUser(User user,Integer flag) {
        userMapper.saveUser(user);
        serverBFeign.saveUser();
        if(1==flag){
            int i=1/0;
        }
        return 1;
    }
}
