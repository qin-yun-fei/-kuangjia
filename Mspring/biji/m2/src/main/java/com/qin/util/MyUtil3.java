package com.qin.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyUtil3 {

	public static SqlSession getSession() throws IOException {
		InputStream is = Resources.getResourceAsStream("m_c.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory  = builder.build(is);
		//生成执行sql 的工具

		SqlSession session  = factory.openSession();

		return session;
	}
}
