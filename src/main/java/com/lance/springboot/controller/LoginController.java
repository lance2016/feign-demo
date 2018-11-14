package com.lance.springboot.controller;


import com.lance.springboot.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lance on 2018/11/7.
 */
@RestController
@RequestMapping("/test")
public class LoginController {

//    @Autowired
//    DcService dcService;
//
    @Autowired
    RemoteService service;
//RemoteService service = Feign.builder()
//        .options(new Request.Options(1000, 3500))
//        .retryer(new Retryer.Default(5000, 5000, 3))
//        .target(RemoteService.class, "http://127.0.0.1:6002");
//
//    RemoteService service = Feign.builder().client(RibbonClient.create()).encoder(new JacksonEncoder())
//            .decoder(new JacksonDecoder()).target(RemoteService.class, "http://sample-client/gradle-web");

    @ResponseBody
    @RequestMapping(value = "/test",method={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
    public String login(){
         return service.getOwner("scott");
    }

    @ResponseBody
    @RequestMapping(value = "/test2",method={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
    public String login2(){
        return service.getUP("scott","DDDD");
    }

    @ResponseBody
    @RequestMapping(value = "/test3",method={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
    public String login3(){
        return service.getUser("scott","DDDD");
    }

}
