package com.jmh.cmdb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jmh.cmdb.serviceImpl.ServerServiceImpl;

@Controller
public class ServerController {
	
	@Autowired
	private ServerServiceImpl serverServiceImpl;
	
	@GetMapping("/getAllServerDetails")
	public String init(HttpServletRequest request){
		request.setAttribute("servers", serverServiceImpl.findAllServerDetails());
		request.setAttribute("mode", "SERVER_VIEW");
		return "serverDetails";
	}

}
