package q.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class H1 extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest
      request, HttpServletResponse response) throws Exception {
        System.out.println("进入 Controller 测试");
        //创建模型视图
        ModelAndView m= new ModelAndView();
        //携带数据
        m.addObject("msg","jingt");
       //设置视图名称
        m.setViewName("index");
        System.out.println("进入 Controller 测试");
        return m;
    }
}
