package com.jmh.cmdb.daoImpl;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jmh.cmdb.entity.Application;

@Repository
public interface ApplicationServerDaoImpl extends JpaRepository<Application, Integer>{

	@Query(value = "SELECT ac.application_cat_name, a.application_name, s.server_name "
			+ "FROM application a INNER JOIN application_category ac "
			+ "ON a.application_cat_id=ac.application_cat_id "
			+ "LEFT OUTER JOIN server s ON a.application_id = s.application_id", nativeQuery = true)
	List<Object[]> getAllApplicationServerMapping();

	@Query(value = "select  a.application_id, a.application_name, ac.application_cat_name, "
			+ "s.server_name, lo.location_name, sos.os_name, s.temp, s.isVirtual "
			+ "from application a "
			+ "left join server s "
			+ "on a.application_id=s.application_id "
			+ "left join application_category ac "
			+ "on ac.application_cat_id= a.application_cat_id "
			+ "left join location lo "
			+ "on s.location_id = lo.location_id "
			+ "left join server_os sos "
			+ "on s.os_id = sos.os_id "
			+ "where a.application_id = :appID", nativeQuery = true)
			Collection<Object[]> getApplicationServerDetails(@Param("appID") Integer id);

}
