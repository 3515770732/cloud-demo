package com.example.demo.web;

import com.example.demo.model.user.po.User;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chen on 2019/7/23.
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;


    @GetMapping(value = "/saveUser/{flag}")
    public String saveUser(@PathVariable Integer flag){
        User user=new User("server-a");
        userService.saveUser(user,flag);
        return "新增成功";
    }



}
