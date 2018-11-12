package com.lance.springboot.controller;

import com.lance.springboot.DcService;
import com.lance.springboot.entity.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lance on 2018/7/2.
 */

@Controller
public class UserController {


    @Autowired
    DcService dcService;

    @RequestMapping("/index")
    public String index(Model model) {
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "index";
    }

    @RequestMapping("/query")
    public String test(){
        return "query";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


//    @ResponseBody
//    @RequestMapping(value = "/login",method = RequestMethod.POST)
//    public String login(String name,String password){
//        return  this.dcService.login(name,password);
//    }
}
