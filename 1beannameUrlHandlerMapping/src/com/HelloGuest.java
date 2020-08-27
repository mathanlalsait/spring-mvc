package com;

import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloGuest extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		//TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	
		Student s1=new Student();
		s1.setAge(5);
		s1.setName("mathan");
		
		String s="hello worldddddddddddddd";		
		
		//////////////////////////////////
		
		ModelAndView model = new ModelAndView("HelloWorldPage");  //page name
		
		model.addObject("msg", s);  
		model.addObject("std", s1);
		model.addObject("date", new Date());
		
		return model;
	}

}