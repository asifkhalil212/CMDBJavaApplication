package com.jmh.cmdb.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmh.cmdb.daoImpl.ServerDAOImpl;
import com.jmh.cmdb.entity.Server;

@Service
public class ServerServiceImpl {

	@Autowired
	private ServerDAOImpl serverDaoImpl;
	
	public Collection<Server> findAllServerDetails() {
		
		List<Server> servers = new ArrayList<>();
		
		//for(Server server: serverDaoImpl.getAllServerNames()){
		for(Server server: serverDaoImpl.findAll()){
		servers.add(server);
		}
		return servers;
	}
		
	
}
