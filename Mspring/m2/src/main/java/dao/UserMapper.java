package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	
	List<User> selectAll();
	
	void delete(int id);
	
	void insert(User user);
	
}
