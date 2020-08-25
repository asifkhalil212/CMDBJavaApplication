package com.jmh.cmdb.daoImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmh.cmdb.entity.Application;

@Repository
public interface ApplicationDAOImpl extends CrudRepository<Application, Integer>{

}
