package com.lance.springboot;

/**
 * Created by lance on 2018/11/11.
 */

import com.lance.springboot.common.FeignConfig;
import com.lance.springboot.entity.User;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "service-login", configuration = FeignConfig.class)
public interface RemoteService {

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("GET /users/list?name={name}")
    String getOwner(@Param(value = "name") String name);


    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("GET /users/list2?name={name}&password={password}")
    String getUP(@Param(value = "name") String name,@Param(value = "password")String password);


    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @RequestLine("GET /users/list3?name={name}&password={password}")
    String getUser(@Param(value = "name") String name,@Param(value = "password")String password);
}
