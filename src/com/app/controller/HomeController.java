package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.service.CustomerService;
import com.google.gson.Gson;

@Controller
public class HomeController 
{
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public @ResponseBody String employeelist() 
	{
	    Gson gson = new Gson();
	    String json = gson.toJson(service.getAllEmployees());
	    return json;
	}
}
