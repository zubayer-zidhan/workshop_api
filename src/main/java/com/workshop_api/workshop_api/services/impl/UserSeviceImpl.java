package com.workshop_api.workshop_api.services.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.workshop_api.workshop_api.entities.Users;
import com.workshop_api.workshop_api.repository.UserRepository;
import com.workshop_api.workshop_api.services.UserService;

@Service
public class UserSeviceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    private final JdbcTemplate jdbcTemplate;


    public UserSeviceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Users> getUserDetails() {
        return userRepository.findAll();
    }

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public String findUserId(String name, String email) {
        String sql = "SELECT id FROM users WHERE name = \"" + name + "\" AND mail = \"" + email + "\"";
        try {
            Integer userId = jdbcTemplate.queryForObject(sql, new RowMapper<Integer>() {
                @Override
                public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getInt("id");
                }
            });
            return String.valueOf(userId);
        } catch (EmptyResultDataAccessException ex) {
            return "Invalid username or email";
        }
    
    }
}
