package com.jmh.cmdb.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmh.cmdb.daoImpl.ApplicationDAOImpl;
import com.jmh.cmdb.entity.Application;

@Service
public class ApplicationServiceImpl {
	
	@Autowired
	private ApplicationDAOImpl applicationDAOImpl;
	
	public Collection<Application> findAllAppsDetails(){
		System.out.println("serviceclass");
		List<Application> apps = new ArrayList<>();
		for(Application app: applicationDAOImpl.findAll()){
			apps.add(app);
		}
		//System.out.println(apps);
		return apps;
	}

	public void deleteApp(Integer id) {
		
		applicationDAOImpl.deleteById(id);
	}
	
	public Application findApplication(int id)
	{
		System.out.println(applicationDAOImpl.findById(id));
		return applicationDAOImpl.findById(id).orElse(null);
	}

	public void saveApplication(Application application) {
		
		applicationDAOImpl.save(application);
	}



}
