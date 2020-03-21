package com.qin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.qin.util.MyUtil3;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.qin.dao.UserMapper;
import com.qin.entity.User;
import com.qin.util.MyUtil;
import com.qin.util.MyUtil2;

public class Test {

	public static void main(String[] args) throws IOException {
      //调用MyUtil的 getSession() 方法 生成 执行sql的工具
		//在其中有  加载核心配置文件 和  构建工厂
		SqlSession session  = MyUtil.getSession();
		//执行查询  去调用配置文件内容
		List<User> list= session.selectList("h.s");
		//h.s是 配置文件里的 <mapper namespace="h">
		//  <select  id="s"
		System.out.println("查询方法1显示");
		System.out.println(list);


		System.out.println("显示方法2");

		SqlSession session1  = MyUtil2.getSession();
		UserMapper mapper = session1.getMapper(UserMapper.class);
		//mybatis的一级缓存是默认开启：
		//同一个session执行相同的sql，只执行一次；
		//第二次执行时返回第一次的缓存

		List<User> list2 =mapper.selecAll();
		List<User> list3= mapper.selecAll1("李");
		System.out.println(list3);
		System.out.println(".......");
		System.out.println(list2);
		System.out.println(JSON.toJSONString(list2));

		System.out.println(".......");

		mapper.selecAll();
		session.close();
		System.out.println(mapper.selecAll());
		System.out.println("***********");

		User u =new User();
		u.setUserCode("admin");
		u.setUserPassword("1234567");
		List<User> list4= mapper.selecAll2(u);
		System.out.println("list4"+JSON.toJSONString(list4));
		System.out.println(".......");
		List<User> list5 =mapper.selecAll();

		System.out.println(list5);
		System.out.println(JSON.toJSONString(list5));
		System.out.println("别名配置方法 UserMapper.xml 显示");
		SqlSession session3  = MyUtil3.getSession();
		UserMapper mapper3 = session3.getMapper(UserMapper.class);

		List<User> list_m =mapper.selecAll();

		System.out.println( list_m);
	//	System.out.println(JSON.toJSONString( list_m));
	}

}
