package com.zzf.demox.controller;

import com.zzf.demox.entity.User;
import com.zzf.demox.mapper.UserMapper;
import com.zzf.demox.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zzf
 * @since 2022-06-26
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String getAllUserName() {
        return userService.getAllUser().toString();
    }

    @GetMapping("/select/{id}")
    @ResponseBody
    public List<User> getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public Integer getLogin(@RequestParam("username") String username,
                            @RequestParam("pwd") String pwd) {
        return userService.getLogin(username, pwd);
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    @ResponseBody
    public Integer getSignUp(@RequestParam("username") String username,
                            @RequestParam("pwd") String pwd) {
        return userService.getSignUp(username, pwd);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String deleteUserById(@PathVariable Integer id) {
        return "delete id = " + id + (userService.deleteUserById(id) == 1 ? "Success!" : "Fail!");
    }


}
