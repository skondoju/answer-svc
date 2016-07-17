package com.answer.svc.dao;

import com.answer.svc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDaoImpl implements UserDao {


    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUser(int id) {

        String sql = "SELECT * FROM user WHERE id = ?";

        User user = jdbcTemplate.queryForObject(
                sql, new Object[]{id},
                new BeanPropertyRowMapper<User>(User.class));

        return user;
    }

    @Override
    public int addUser(String name, String email) {

        //String sql=  "INSERT INTO user (" + " name, " + " email) "+ "VALUES (?, ?)";
        String sql=  "INSERT INTO user ( name, email) "+ "VALUES (?, ?)";

        int id = jdbcTemplate.update(sql, new Object[]{name, email});
        System.out.println("id "+ id);


        return id;
    }

    @Override
    public int updateUser(String name,int id) {

        String updateSql = "UPDATE user SET name = ?  WHERE id = ? ";
        int updatedid = jdbcTemplate.update(updateSql,new Object[]{name, id});
        System.out.println("updatedid "+ updatedid);


        return updatedid;
    }

    @Override
    public int removeUser(int id) {

        String delSql = "DELETE FROM user WHERE id = ?";
        int deleteId = jdbcTemplate.update(delSql,new Object[]{id});
        System.out.println(deleteId);

        return deleteId;
    }
}

