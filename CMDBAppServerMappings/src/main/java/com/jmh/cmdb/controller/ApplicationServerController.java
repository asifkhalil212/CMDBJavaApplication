package com.jmh.cmdb.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jmh.cmdb.entity.ApplicationServer;
import com.jmh.cmdb.serviceImpl.ApplicationServerServiceImpl;

@Controller
public class ApplicationServerController {
	
	@Autowired
	private ApplicationServerServiceImpl applicationServerServiceImpl;
	
	@GetMapping("getApplicationServerMappings")
	public String getAppServerMappings(HttpServletRequest request){
		request.setAttribute("applicationServerMappings", applicationServerServiceImpl.findAllAppsServerMapping());
		request.setAttribute("mode", "APPLICATION_SERVER_MAPPINGS");
		return "applicationServerDetails";
	}
	
	@GetMapping("getApplicationServerDetails")
	public String getAppServerMappingsDetails(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("applicationServerDetails", applicationServerServiceImpl.findApplicationServerDetails(id));
		request.setAttribute("mode", "APPLICATION_SERVER_DETAILS_VIEW");
		//return applicationServerServiceImpl.findApplicationServerDetails();
		return "applicationServerDetails";
	}
}
