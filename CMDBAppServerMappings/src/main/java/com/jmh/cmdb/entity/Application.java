package com.jmh.cmdb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*@Getter
@Setter
@NoArgsConstructor*/
//@Data
@Entity
public  class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int application_id;
	private String application_name; 
	private String version; 
	private String support; 
	private int application_cat_id; 
	private String application_sub_cat_id;
	
		
	public Application() {
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

	@Override
	public String toString() {
		return "Application [application_id=" + application_id + ", application_name=" + application_name + ", version="
				+ version + ", support=" + support + ", application_cat_id=" + application_cat_id
				+ ", application_sub_cat_id=" + application_sub_cat_id + "]";
	}
	
	
}
