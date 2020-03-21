package com.q.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RequestMapping("/u")//用注解表示一个控制器
@Controller
public class new2  {

@RequestMapping("/h2.do")
    public ModelAndView h2(String ms){
        System.out.println("进h2");
        ModelAndView m= new ModelAndView();//构建模型视图
        m.addObject("msg",ms);//数据携带
        m.setViewName("index");//目的地设定
       // return  new ModelAndView("index");
        return m;
    }
    @RequestMapping(value = "/h3.do",method = RequestMethod.GET)
    public ModelAndView h3(@RequestParam(name = "msg",
            required = false) String ms){
        System.out.println("进h3");
        ModelAndView m= new ModelAndView();//构建模型视图
        m.addObject("msg",ms);//数据携带
        m.addObject("username","qin");//数据携带
        m.addObject("password","0000");//数据携带
        m.setViewName("index2");//目的地设定
        // return  new ModelAndView("index");
        return m;
    }

    @RequestMapping("/s.do")
    public String s(Model model){
        model.addAttribute(
 "msg","qin");//添加数据
        return "index2";//跳转页面
    }
    @RequestMapping("/s2.do")
    public String s2(Map<String,Object> map){
        map.put("msg","qin");//添加数据
        return "index";//跳转页面
    }
}