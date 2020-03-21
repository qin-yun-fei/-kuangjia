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
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	String  当前页=	request.getParameter("page");//更具layui要求传递  当前页
//  String  每页条数=request.getParameter("limit");//更具layui要求传递  每页条数


		//System.out.println("显示方法2");

		SqlSession session2  = MyUtil2.getSession();
		//执行sql查询
		UserMapper1 mapper2 = session2.getMapper(UserMapper1.class);
		//封装为对象
		List<User> list2 =mapper2.selecAll();
		//转换数据为jion数组
		JSONArray list =JSONArray.parseArray( JSON.toJSONString(list2,true));

		JSONObject object= new JSONObject();
		object.put("code", 0);
		object.put("msg", "获取数据成功");
		object.put("count", 1000);//1000要换成实际sql的数据条数
		object.put("data", list);

//	System.out.println(JSON.toJSONString(list2));
//	 System.out.println(list);
//	  System.out.println(".......");
		//把jion数组响应给页面
		//给定格式？
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out =  response.getWriter();
		out.print(object);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uid =req.getParameter("uid");
		String uname =req.getParameter("uname");
		//执行sql查询
		SqlSession session2  = MyUtil2.getSession();
		UserMapper1 mapper2 = session2.getMapper(UserMapper1.class);
		//执行sql修改
		mapper2.update(Integer.parseInt(uid), uname);
		//执行sql提交事物
		session2.commit();

		//执行响应
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out =  resp.getWriter();
		out.print("ok成");
	}

}
