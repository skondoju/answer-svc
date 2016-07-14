package com.answer.svc;


import com.answer.svc.dao.UserDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-config-test.xml")
public class UserDaoImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUser() {
        System.out.println(userDao.getUser(1));
    }

}
