package com.q.test;

import com.q.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    ApplicationContext ctx;

    //加载配置文件，创建application对象
    public void init() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    //测试创建user对象

    public void test1() {
        //初始化ioc容器
        init();
        //获取bean
        User user = ctx.getBean("user",User.class);
        user.show();
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.test1();
    }

}
