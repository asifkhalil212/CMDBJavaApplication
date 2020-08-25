package com.jmh.cmdb.controller;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmh.cmdb.entity.Application;
import com.jmh.cmdb.entity.Server;
import com.jmh.cmdb.serviceImpl.ApplicationServiceImpl;
import com.jmh.cmdb.serviceImpl.ServerServiceImpl;

@RestController
public class MainRestController {
	
	@Autowired
	private ServerServiceImpl serverServiceImpl;

	@Autowired
	private ApplicationServiceImpl applicationServiceImpl;
	
	@GetMapping(value = "/test")
	public String hello()
	{
		return "Hello world!";
	}
		
	@GetMapping("/getAllAppsList")
	public Collection<Application> getAllAppsDetails(){
		return applicationServiceImpl.findAllAppsDetails();
		
	}
	
		
	@GetMapping("/deleteApp")
	public void deleteApps(@RequestParam Integer id)
	{
		applicationServiceImpl.deleteApp(id);
	}
}

