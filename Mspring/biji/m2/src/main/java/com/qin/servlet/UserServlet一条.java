package com.qin.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qin.dao.UserMapper1;
import com.qin.entity.User;
import com.qin.util.MyUtil;
import com.qin.util.MyUtil2;
@WebServlet("/UserServlet01")
public class UserServlet一条 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("显示方法2");
		String id = request.getParameter("id");
		SqlSession session2  = MyUtil2.getSession();
		//执行sql查询
		UserMapper1 mapper2 = session2.getMapper(UserMapper1.class);
		//封装为对象  id是用int的实用类转换
		User user =mapper2.selec01(Integer.parseInt(id));

		//把jion数组响应给页面
		//给定格式？
		request.setAttribute("user", user);
		request.getRequestDispatcher("tk.jsp").forward(request, response);
	}


}
