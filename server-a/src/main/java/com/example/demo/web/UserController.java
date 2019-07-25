package com.example.demo.web;

import com.example.demo.model.user.po.User;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2019/7/23.
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping(value = "/saveUser")
    public String saveUser(){
        User user=new User("server-a");
        userService.saveUser(user);
        return "新增成功";
    }



}
