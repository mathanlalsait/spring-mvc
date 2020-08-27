package com.candidjava.springmvc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.springmvc.bean.StudentBean;

@Controller
@RequestMapping("/student")
public class StudentController
{

	@RequestMapping(value="/welcome.abcd",method=RequestMethod.GET)
	public ModelAndView getUser(HttpServletRequest request, HttpServletResponse reponse)
	{
		String un=request.getParameter("uname");
		String pw=request.getParameter("pass");
		
		
		//
		//
		//

		ModelAndView mv=new ModelAndView("test"); // v
		mv.addObject("msg","Welcoem to Spring");
		mv.addObject("name",un);
		
		return mv;
	}
	
	
	@RequestMapping(value="/contact.abcd",method=RequestMethod.GET)
	public String contact()
	{
		
		return "contact";
	}
	
	
	
	
	@RequestMapping(value="/Register.abcd",method = RequestMethod.POST)
	public ModelAndView getFormData(StudentBean sb)
	{
	/*
		String u=request.getParameter("uname");
		String p=request.getParameter("pass");
	        User user=new User();
	        user.setUserName(u);
	        user.setPassword(p);
	*/
		
		
			System.out.println("Reg No..................." + sb.getRegno());
			System.out.println("Name..................." + sb.getSname());
			System.out.println("Course..................." + sb.getCourse());
			System.out.println("City..................." + sb.getAddressBean().getCity());
			System.out.println("State..................." + sb.getAddressBean().getState());
			System.out.println("Pincode..................." + sb.getAddressBean().getPincode());
	
			
			ModelAndView model = new ModelAndView("page");		
					model.addObject("ob", sb); 
					model.addObject("msg","Welcome");
	//  both will work it will automatically injected to on object
	//  model.addObject("msg", "Student Registration Details");
		
		return model;
	}
	
	
	@RequestMapping(value = "/login.abcd")
	public ModelAndView addCustomer(@RequestParam("uname") String name,	
			@RequestParam("pass") String passward)
	{
		//String name=request.getParameter("uname");
		ModelAndView model = new ModelAndView("page");

		model.addObject("msg", "RequestMapping for URL Parameters username = " + name + " and password = " + passward);

		return model;
	}
	
	
	@RequestMapping("/delete/{id}")
	public ModelAndView helloString(@PathVariable("id") String cn)
	{
		ModelAndView model = new ModelAndView("page");
		model.addObject("msg", "Country : " + cn);
		return model;
	}
	
}