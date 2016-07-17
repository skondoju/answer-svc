package com.answer.svc.controllers;

import com.answer.svc.domain.User;
import com.answer.svc.services.UserAppSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserAppSvc userAppSvc;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int userId) {

        return userAppSvc.getUser(userId);
    }



}
