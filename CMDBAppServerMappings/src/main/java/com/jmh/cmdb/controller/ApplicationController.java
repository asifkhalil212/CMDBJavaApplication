package com.jmh.cmdb.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jmh.cmdb.entity.Application;
import com.jmh.cmdb.serviceImpl.ApplicationServerServiceImpl;
import com.jmh.cmdb.serviceImpl.ApplicationServiceImpl;

@Controller
public class ApplicationController {
	
	@Autowired
	private ApplicationServiceImpl applicationServiceImpl;
	
	@GetMapping("/")
	public String init(HttpServletRequest request){
		request.setAttribute("applications", applicationServiceImpl.findAllAppsDetails());
		request.setAttribute("mode", "APPLICATION_VIEW");
		return "index";
	}
	
	@GetMapping("/updateApplication")
	public String init(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("application", applicationServiceImpl.findApplication(id));
		request.setAttribute("mode", "APPLICATION_EDIT");
		return "index";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Application application, HttpServletRequest request)
	{
		applicationServiceImpl.saveApplication(application);
		request.setAttribute("applications", applicationServiceImpl.findAllAppsDetails());
		request.setAttribute("mode", "APPLICATION_VIEW");
		return "index";
	}
	
	@GetMapping("/addApplication")
	public String addApplication(HttpServletRequest request){
		request.setAttribute("mode", "NEW_APPLICATION");
		return "index";
	}
	
	@GetMapping("/deleteApplication")
	public String deleteApplication(@RequestParam int id, HttpServletRequest request){
		
		applicationServiceImpl.deleteApp(id);
		request.setAttribute("applications", applicationServiceImpl.findAllAppsDetails());
		request.setAttribute("mode", "APPLICATION_VIEW");
		return "index";
	}
	
	
}





