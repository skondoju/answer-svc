package com.answer.svc.dao;


import com.answer.svc.domain.User;

public interface UserDao {

    public User getUser(int id);

    public int addUser(String name, String email);

    public int updateUser(String name, int id);

    public int removeUser(int id);

}
