package com.jmh.cmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"com.jmh.cmdb.controller","com.jmh.cmdb.daoImpl","com.jmh.cmdb.serviceImpl"})
public class CMDBApplicationServerMappingsProject {

	public static void main(String[] args) {
		
		SpringApplication.run(CMDBApplicationServerMappingsProject.class, args);
		
	}

}
