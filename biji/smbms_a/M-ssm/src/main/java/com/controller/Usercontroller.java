package com.controller;

import com.alibaba.fastjson.JSON;
import com.e.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class Usercontroller {
    @Autowired
    UserService s;
    @RequestMapping("/ulist")
    public String  ul(Model model){
        List<User> list = s.selectAll();
        model.addAttribute("list",list);
        return  "list";
    }

}
