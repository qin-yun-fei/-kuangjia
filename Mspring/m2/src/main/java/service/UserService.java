package service;

import dao.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	
	public List<User> list(){
		return mapper.selectAll();
	}
	
	/**
	 * 给删除用户添加事务
	 * 在没有添加事务的情况下,即使发生了异常,也会删除数据,并不会回滚
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(int id){
		mapper.delete(id);
//		int a = 10/0;	//模拟异常
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void insert(User user){
		mapper.insert(user);
		int a = 10/0;	//模拟异常
	}
}
