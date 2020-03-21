package com.qin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qin.entity.User;

public interface UserMapper1 {
	List<User> selecAll();//全查询
	User selec01(int id);//条件查询
	List<User> selecAll1(String uname);//模糊查询
	List<User> selecAll2(User user);//对象查询
	//
	void update(@Param("uid")int uid , @Param("uname")String uname);
	void delete(int id);

	void insert(User user);


}
