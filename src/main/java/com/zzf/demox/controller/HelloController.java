package com.zzf.demox.controller;

import com.zzf.demox.entity.User;
import com.zzf.demox.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/test2")
    @ResponseBody
    public String test2() {
        return "hello";
    }

}
