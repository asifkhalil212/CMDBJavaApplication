package com.jmh.cmdb.daoImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmh.cmdb.entity.ApplicationCategory;

@Repository
public interface ApplicationCategoryDaoImpl extends CrudRepository<ApplicationCategory, Integer>{

	
}
