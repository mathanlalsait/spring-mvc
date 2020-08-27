package com.candidjava.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.springmvc.entity.Employee;
import com.candidjava.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService; 
	// EmployeeService employeeService =new EmployeeServiceImpl();

	@RequestMapping("register")
	public ModelAndView viewRegister(@ModelAttribute Employee employee) {
		return new ModelAndView("Register");
	}

	@RequestMapping("login")
	public ModelAndView viewLogin(@ModelAttribute Employee employee) {
		
		return new ModelAndView("Login");
	}

	@RequestMapping("saveRegister")
	public ModelAndView createUser(@ModelAttribute Employee employee) {
		employeeService.createEmployee(employee);
		return new ModelAndView("redirect:login");
	}

	@RequestMapping("checkLogin")
	public ModelAndView processLogin(@ModelAttribute Employee employee) {
		Employee emp = employeeService.getEmployee(employee);
		
		if (emp == null) {
			ModelAndView model = new ModelAndView("Login");
			model.addObject("result", "Invalid Username or Password");
			return model;
		} else {
			System.out.println(emp.getName());
			ModelAndView model = new ModelAndView("LoginSuccess");
			model.addObject("emp", emp.getName());
			return model;
		}
	}

}