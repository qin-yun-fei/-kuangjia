package com.q.controller;

import com.alibaba.fastjson.JSON;
import com.q.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class Usercontroller {
	@Autowired
    UserService service;
	
	@RequestMapping("/qulogin")
	public String qulogin(){
		System.out.println("****1***");
		return "login";
	}
	
//	@RequestMapping("/login")
//	public String login(String userCode, String userPassword, HttpSession session){
////		int i = 10/0;
//		List<Map<String, Object>> list = service.selectByCodeAndPassword(userCode, userPassword);
//		System.out.println(JSON.toJSONString(list,true));
//		if (list.size()>0){
//			session.setAttribute("user",list.get(0));
//			return "index";
//		}
//		return "redirect:gologin";
//	}
	
//	@RequestMapping("/loginout")
//	public String loginout(HttpSession session){
//		session.invalidate();
//		return "redirect:gologin";
//	}
//
//	@ExceptionHandler(RuntimeException.class)
//	public String exception(Exception e){
//		System.out.println(e.getMessage());
//		return "500";
//	}
}
