package com.qin.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.qin.dao.UserMapper1;
import com.qin.entity.User;
import com.qin.util.MyUtil;
import com.qin.util.MyUtil2;

public class Test {

	public static void main(String[] args) throws IOException {
//		//加载核心配置文件
//		InputStream is =Resources.getResourceAsStream("mybatis-config.xml");
//		//构建工厂函数
//		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//		SqlSessionFactory factory  = builder.build(is);
//		//生成执行sql 的工具
//
//		SqlSession session  = factory.openSession();

		SqlSession session  = MyUtil.getSession();
		//执行查询
		List<User> list= session.selectList("h.s");
		System.out.println("查询方法1显示");
		System.out.println(list);


		System.out.println("显示方法2");

		SqlSession session2  = MyUtil2.getSession();
		UserMapper1 mapper2 = session2.getMapper(UserMapper1.class);
		//mybatis的一级缓存是默认开启：
		//同一个session执行相同的sql，只执行一次；
		//第二次执行时返回第一次的缓存

		List<User> list2 =mapper2.selecAll();
		List<User> list3= mapper2.selecAll1("李");
		System.out.println(list3);
		System.out.println(".......");
		System.out.println(list2);
		System.out.println(JSON.toJSONString(list2));

		System.out.println(".......");

		mapper2.selecAll();
		session.close();
		System.out.println(mapper2.selecAll());
		System.out.println("***********");

		User u =new User();
		u.setUserCode("admin");
		u.setUserPassword("1234567");
		List<User> list4= mapper2.selecAll2(u);
		System.out.println(JSON.toJSONString(list4));
	}

}
