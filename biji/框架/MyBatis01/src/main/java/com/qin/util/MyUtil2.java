package com.qin.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyUtil2 {

	public static SqlSession getSession() throws IOException {
		//加载核心配置文件
		InputStream is = Resources.getResourceAsStream("config/mybatis1.xml");
		//构建工厂
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory  = builder.build(is);
		//生成执行sql 的工具
		//SqlSession  是执行sql的工具
		SqlSession session  = factory.openSession();

		return session;
	}
}
