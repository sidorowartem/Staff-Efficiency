package com.staff.efficiency.controllers;

import com.staff.efficiency.dto.ResponseWrapper;
import com.staff.efficiency.models.UserModel;
import com.staff.efficiency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserDataController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public ResponseWrapper<UserModel> getUser() {
        UserModel userModel = userService.getRandomUser();
        return new ResponseWrapper<>(userModel);
    }
}
