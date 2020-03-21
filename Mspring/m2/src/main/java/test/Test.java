package test;

import com.alibaba.fastjson.JSON;
import entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		//初始化ioc容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-anno.xml");
		
		UserService service = ctx.getBean("userService",UserService.class);
//		service.delete(16);
		List<User> list = service.list();
//		System.out.println(JSON.toJSONString(list,true) + "--" + list.size());
		for (User user : list) {
			System.out.println(user.getUserName());
		}
//		User user = new User();
//		user.setUserCode("haha1");
//		user.setUserName("哈哈1");
//		user.setUserPassword("0000001");
//		service.insert(user);
	}
}
