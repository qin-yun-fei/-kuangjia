package com.qin.test;


import com.qin.entity.User;
import com.qin.service.User1;
import com.qin.util.MyUtil3;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class T {
    public static void main(String[] args) throws IOException {


   SqlSession session  = MyUtil3.getSession();
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("aop.xml");

        User1 service = ctx.getBean("user1",User1.class);

        List<User> list = service.list();
        for (User user : list) {
            System.out.println(user.getUserName());
        }
    }
}
