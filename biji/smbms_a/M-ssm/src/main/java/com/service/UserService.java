package com.service;

import com.dao.UserDao;
import com.dao.UserMapper;
import com.e.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
	@Autowired
    UserMapper u;
	public  List<User> selectAll(){
	    return u.selectAll();//数据转发
    }

}
