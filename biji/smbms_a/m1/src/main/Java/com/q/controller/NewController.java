package com.q.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        System.out.println("进来了");
        ModelAndView m= new ModelAndView();//构建模型视图
        m.addObject("msg","我学慢了");//数据携带
        m.setViewName("index");//目的地设定
       // return  new ModelAndView("index");
        return m;
    }
}