package com.lance.springboot;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lance on 2018/11/11.
 */



@FeignClient("service-login")
public interface DcService {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String login(@RequestParam("name") String name, @RequestParam("password") String password);
}