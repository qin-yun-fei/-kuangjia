package com.q.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q.dao.UserDao;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
	
	@Autowired
    UserDao dao;
	public List<Map<String, Object>> selectByCodeAndPassword(String code, String password){
		return dao.selectByCodeAndPassword(code,password);
	}
}
