package com.ipm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.xbean.propertyeditor.StringEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	
	@RequestMapping(value= {"/index",""})
	public String index(HttpServletResponse resp) throws Exception{
		return "plus";
	}
	
	@RequestMapping("/jieguo")
	public 	ModelAndView  jieguo(HttpServletRequest res ) throws Exception{
		ModelAndView obj = new ModelAndView();
		int a1= Integer.parseInt(res.getParameter("a1"));
		int a2= Integer.parseInt(res.getParameter("a2"));
	     int a3 =a1+a2;
/*	    obj.addObject("a1", a1);
	    obj.addObject("a2", a2);
        obj.addObject("a3", a3);*/
/*	     int[] a = new int[3]; 
	     a[0] = a1;
	     a[1] = a2;
	     a[2] = a3;
	     obj.addObject("a", a);*/
	     List aa =new ArrayList();
	     aa.add(a1);
	     aa.add(a2);
	     aa.add(a3);
	     obj.addObject("aa", aa);
        obj.setViewName("plus");
        return  obj;
	}
	
	@RequestMapping("/hello")
	public void test(HttpServletResponse resp) throws Exception{
		resp.getWriter().write("hello");
	}
	
	@RequestMapping("/jieguo2")
	public 	void jieguo2(HttpServletRequest res,HttpServletResponse resp ) throws Exception{
		ModelAndView obj = new ModelAndView();
		int a1= Integer.parseInt(res.getParameter("a1"));
		int a2= Integer.parseInt(res.getParameter("a2"));
	     int a3 =a1+a2;
		resp.getWriter().write(a3+"");
	}
	
	
	
	
}
