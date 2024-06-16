package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cjc.iservice.ServiceInterface;
import com.cjc.model.Employee;
import com.cjc.serviceimpl.ServiceImpl;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	ServiceInterface service=new ServiceImpl();
	
	@RequestMapping("/reg")   //
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/register")
	public String add(@ModelAttribute Employee emp)
	{
		//System.out.println(emp);
	    System.out.println(emp.getId());
		int id=service.saveEmployee(emp);
		System.out.println(id);
		if(id>0)
		{
		return "login";
		}else{
			return "register";
		}
	}
}
