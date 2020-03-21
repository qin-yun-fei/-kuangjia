package q.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RequestMapping("/u")
@Controller//用注解表示一个控制器
public class H2  {//Ab
    @RequestMapping("/h.do")
  //  public ModelAndView hello(@RequestParam(name = "msg",required = false) String msg) {

        public ModelAndView hello(){   System.out.println("进入 Controller 测试");
        ModelAndView m= new ModelAndView();
        m.addObject("msg","jingt");
        m.setViewName("index");
        return m;
    }
    @RequestMapping("s.do")
    public  String show(Model model){
        model.addAttribute("msg","add");
        return "new";

    }
    @RequestMapping("s2.do")//map 和 Model  效果一样
    public  String show2(Map<String,Object> map){
       map.put("msg","add2");
        return "new";

    }
}
