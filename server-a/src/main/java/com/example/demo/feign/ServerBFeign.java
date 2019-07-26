package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by chen on 2019/7/26.
 */
@Component
@FeignClient(value = "server-b")
public interface ServerBFeign {

    @GetMapping(value = "/user/saveUser")
    public String saveUser();
}
