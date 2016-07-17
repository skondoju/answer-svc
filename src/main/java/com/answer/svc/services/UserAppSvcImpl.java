package com.answer.svc.services;

import com.answer.svc.dao.UserDao;
import com.answer.svc.domain.User;


public class UserAppSvcImpl implements UserAppSvc {

    private UserDao userDao;


    public UserAppSvcImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(int userId) {

        return userDao.getUser(userId);

    }
}
