package com.jmh.cmdb.entity;

import lombok.Getter;
import lombok.Setter;


public class ApplicationServer {
	
	private int application_id;
	private String application_name; 
	private String version; 
	private String support; 
	private int application_cat_id; 
	private String application_sub_cat_id;

	private Integer serverId;
	private String serverName; 
	private Integer applicationId;
	private Integer server_type_id;
	private Integer environmentId;
	private Integer locationId;
	private Integer osId;
	private Integer isVirtual;
	private Integer validated;
	private String temp;
		
	public ApplicationServer() {
		super();
	}
	
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getApplication_name() {
		return application_name;
	}
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSupport() {
		return support;
	}
	public void setSupport(String support) {
		this.support = support;
	}
	public int getApplication_cat_id() {
		return application_cat_id;
	}
	public void setApplication_cat_id(int application_cat_id) {
		this.application_cat_id = application_cat_id;
	}
	public String getApplication_sub_cat_id() {
		return application_sub_cat_id;
	}
	public void setApplication_sub_cat_id(String application_sub_cat_id) {
		this.application_sub_cat_id = application_sub_cat_id;
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
