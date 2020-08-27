package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CustomerController extends AbstractController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		//throw new GenericException("Oppss...System error, please visit it later");
		
		throw new Exception("Oppss...System error, please visit it later");
		
		//ModelAndView model = new ModelAndView("WelcomePage");
		//return model;
	}
	
}