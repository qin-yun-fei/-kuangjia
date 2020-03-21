package com.dao;


import com.e.User;

import java.util.List;


public interface UserMapper {
	
	List<User> selectAll();
	
	void delete(int id);
	
	void insert(User user);
	
}
