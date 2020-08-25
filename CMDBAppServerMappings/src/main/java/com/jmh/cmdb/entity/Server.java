package com.jmh.cmdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@JsonIgnoreProperties
public class Server {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "server_id")
	private Integer serverId;
	@Column(name = "server_name")
	private String serverName; 
	@Column(name = "application_id")
	private Integer applicationId;
	@Column(name = "server_type_id")
	private Integer server_type_id;
	@Column(name = "environment_id")
	private Integer environmentId;
	@Column(name = "location_id")
	private Integer locationId;
	@Column(name = "os_id")
	private Integer osId;
	private Integer isVirtual;
	private Integer validated;
	private String temp;
	
	public Server() {
		super();
	}
	
	public Integer getServerId() {
		return serverId;
	}
	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public Integer getServer_type_id() {
		return server_type_id;
	}
	public void setServer_type_id(Integer server_type_id) {
		this.server_type_id = server_type_id;
	}
	public Integer getEnvironmentId() {
		return environmentId;
	}
	public void setEnvironmentId(Integer environmentId) {
		this.environmentId = environmentId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Integer getOsId() {
		return osId;
	}
	public void setOsId(Integer osId) {
		this.osId = osId;
	}
	public Integer getIsVirtual() {
		return isVirtual;
	}
	public void setIsVirtual(Integer isVirtual) {
		this.isVirtual = isVirtual;
	}
	public Integer getValidated() {
		return validated;
	}
	public void setValidated(Integer validated) {
		this.validated = validated;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
}
