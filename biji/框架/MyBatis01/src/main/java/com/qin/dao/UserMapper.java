package com.qin.dao;

import com.qin.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	List<User> selecAll();//全查询
	User selec01(int id);//条件查询
	List<User> selecAll1(String uname);//模糊查询
	List<User> selecAll2(User user);//对象查询
	//@Param 注解
	void update(@Param("uid") int uid, @Param("uname") String uname);
	void delete(int id);

	void insert(User user);


}
