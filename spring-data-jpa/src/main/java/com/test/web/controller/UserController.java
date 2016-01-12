package com.test.web.controller;

import com.test.persist.jpa.User;
import com.test.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description: UserController
 * @anthor: shi_lin
 * @CreateTime: 2016-01-12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value ="/{uid}")
    public Object excute(@PathVariable("uid")Long userid) {
        User byUserId = userService.findByUserId(userid);

        return byUserId;
    }

}
