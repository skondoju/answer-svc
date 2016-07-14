package com.answer.svc.dao;

import com.answer.svc.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


public class UserDaoImpl implements UserDao {


    private JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUser(int id) {

        String sql = "SELECT * FROM users WHERE usid = ?";

        User user = jdbcTemplate.queryForObject(
                sql, new Object[] { id },
                new BeanPropertyRowMapper<User>(User.class));

        return user;
    }
}

