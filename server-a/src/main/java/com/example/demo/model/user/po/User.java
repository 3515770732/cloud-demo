package com.example.demo.model.user.po;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by chen on 2019/7/23.
 */
@Slf4j
public class User {
  private  Integer id;
  private String name;

  public User(String name) {
    this.name = name;
  }
}
