package com.mkyong.common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class DummyController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		return new ModelAndView("redirect:DummyRedirectPage.htm");
		//return new ModelAndView("DummyRedirect");
		
	}
		
}