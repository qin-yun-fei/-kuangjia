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
public class User {

    @RequestMapping("/g")//测试
    public String h(){        System.out.println("进1");        return "index1";    }
    @RequestMapping("/gl")//先进login。jsp
    public String hl(){        System.out.println("进login");return "login";
                             }
@Autowired
    UserService service;

    @RequestMapping("/login")
    public String login(String userCode, String userPassword, HttpSession session){
//		int i = 10/0;
        System.out.println(userCode+"***login**"+userPassword);
        List<Map<String, Object>> list = service.login(userCode, userPassword);
        System.out.println(JSON.toJSONString(list,true));
        if (list.size()>0){
            session.setAttribute("user",list.get(0));
            return "index";
        }
        return "redirect:gologin";
    }
@RequestMapping("/lo")
    public String lo(String userCode, String userPassword){
    System.out.println(userCode+"**lo***"+userPassword);
    List<Map<String, Object>> list=service.login(userCode, userPassword);
    System.out.println(JSON.toJSONString(list,true));
    if (list.size()>0){
        return "index1";
    }
    return "redirect:go";

}

    @RequestMapping("/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "redirect:gologin";
    }

//	@ExceptionHandler(RuntimeException.class)
//	public String exception(Exception e){
//		System.out.println(e.getMessage());
//		return "500";
//	}
}