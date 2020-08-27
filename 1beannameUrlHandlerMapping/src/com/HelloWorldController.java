package com;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController 
{

	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception 
	{	
	
		
		Student s1=new Student();
		s1.setAge(5);
		s1.setName("mathan");
		
		String s="hello world";		
		
		//////////////////////////////////
		
		ModelAndView model = new ModelAndView();  
		
		model.setViewName("HelloWorldPage");//page name
	
		model.addObject("msg", s);  
		model.addObject("std", s1);
		model.addObject("date", new Date());
		
		return model;
	}
}
