package com.jmh.cmdb.daoImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jmh.cmdb.entity.Server;

@Repository
public interface ServerDAOImpl extends CrudRepository<Server, Integer>{

	/*@Query("from Server where server_id=6")
	Collection<Server> getAllServerNames();*/
}
