package com.jmh.cmdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application_category")
public class ApplicationCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="application_cat_id") 
	private Integer applicationCatId;
	@Column(name="application_cat_name")
	private String applicationCatName;
	
	public ApplicationCategory() {
		super();
	}
	public Integer getApplicationCatId() {
		return applicationCatId;
	}
	public void setApplicationCatId(Integer applicationCatId) {
		this.applicationCatId = applicationCatId;
	}
	public String getApplicationCatName() {
		return applicationCatName;
	}
	public void setApplicationCatName(String applicationCatName) {
		this.applicationCatName = applicationCatName;
	}
	
	@Override
	public String toString() {
		return "ApplicationCategory [applicationCatId=" + applicationCatId + ", applicationCatName="
				+ applicationCatName + "]";
	}
	
}
