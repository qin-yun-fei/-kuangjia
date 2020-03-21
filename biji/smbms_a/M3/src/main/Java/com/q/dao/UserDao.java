package com.q.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Map<String, Object>> select(String code, String password){
        String sql = "select * from smbms_user where userCode=? and userPassword=?";
        List<Map<String, Object>> ls= jdbcTemplate.queryForList(sql);//, new Object[]{code, password}
        return ls;
    }

}
