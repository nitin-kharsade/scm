package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.EmployeeService;
import com.google.gson.Gson;

@Controller
public class HomeController 
{
	@Autowired
	private EmployeeService service;
	@RequestMapping("/reg")
	public ModelAndView showRegPage()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("register");
		return mav;
	}
	
	@RequestMapping("/insert")
	public ModelAndView insertObject(@ModelAttribute("employee")Employee emp)
	{
		ModelAndView mav=new ModelAndView();
		service.saveEmployeeObject(emp);
		mav.addObject("empObj","one record added"+emp.getEmpId());
		mav.setViewName("show");
		return mav;
		
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public @ResponseBody String employeelist() 
	{
	    Gson gson = new Gson();
	    String json = gson.toJson(service.getAllEmployees());
	    System.out.println("JSON"+json);
	   /* ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("empObj",json).setViewName("show");*/
	    return json;
	}
}
