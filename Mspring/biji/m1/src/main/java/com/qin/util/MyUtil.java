package com.qin.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.alibaba.fastjson.JSON;
import com.qin.entity.User;

public class MyUtil {

	public static SqlSession getSession() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis_config.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory  = builder.build(is);
		//生成执行sql 的工具

		SqlSession session  = factory.openSession();

		return session;
	}
}
