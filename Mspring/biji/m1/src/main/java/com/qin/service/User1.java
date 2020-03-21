package com.qin.service;
import com.qin.entity.User;
import com.qin.dao.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class User1 {
    @Autowired
    UserMapper1  mapper;
    public List<User> list(){
        return mapper.selecAll();
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
      //  int a = 10/0;	//模拟异常
    }
}
