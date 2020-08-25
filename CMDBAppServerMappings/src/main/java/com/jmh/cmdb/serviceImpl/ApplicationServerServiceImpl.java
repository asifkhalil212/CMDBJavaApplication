package com.jmh.cmdb.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmh.cmdb.daoImpl.ApplicationServerDaoImpl;
import com.jmh.cmdb.entity.ApplicationServer;

@Service
public class ApplicationServerServiceImpl {

	@Autowired
	private ApplicationServerDaoImpl applicationServerDaoImpl;

	public Collection<Object[]> findAllAppsServerMapping() {

		List<Object[]> apps = new ArrayList<>();
		for(Object[] app: applicationServerDaoImpl.getAllApplicationServerMapping()){
			apps.add(app);
		}
		return apps;
	}

	public Collection<Object[]> findApplicationServerDetails(int id) {

		Collection<Object[]> apps = new ArrayList<>();
		for(Object[] app: applicationServerDaoImpl.getApplicationServerDetails(id)){
			apps.add(app);
		}
		System.out.println(apps);
		return apps;
	}



}
