package com.candidjava.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/customer")
@Controller
public class CustomerController
{

	@RequestMapping("/delete.aaa")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("msg", "this is add methofd");

		return mv;

	}

	@RequestMapping("/update.aaa")
	public String update() throws Exception
	{

		return "user/page1";

	}

	@RequestMapping("/*.aaa")
	public String list() throws Exception
	{

		return "page2";

	}
	
	@RequestMapping(value = "/add.aaa", method = RequestMethod.GET)
	public ModelAndView hhhhhh() throws Exception
	{

		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("msg", "this is add methofd");

		return mv;
	}
	
	
	@RequestMapping(value = "/add.aaa", method = RequestMethod.POST)
	public ModelAndView hhhhhhaa() throws Exception
	{

		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("msg", "this is add methofd");

		return mv;
	}

}