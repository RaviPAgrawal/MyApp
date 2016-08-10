package com.myapp.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myapp.bean.UserDTO;
import com.myapp.myapp_service.UserService;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUserProfile", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> login(HttpServletRequest request) {
        return userService.getUserProfile(request);
    }

    @RequestMapping(value = "/updateUserProfile", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> updateUserProfile(@RequestBody UserDTO userDTO, HttpServletRequest request) {
        return userService.updateUserProfile(userDTO, request);
    }

}
