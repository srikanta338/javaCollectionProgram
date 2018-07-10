package com.model;

import java.util.List;

public class Organization {
	
	private int orgId;
	private String oName;
	private List<Employee> Employee;
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Organization(int orgId, String oName, List<com.model.Employee> employee) {
		super();
		this.orgId = orgId;
		this.oName = oName;
		Employee = employee;
	}


	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public List<com.model.Employee> getEmployee() {
		return Employee;
	}
	public void setEmployee(List<com.model.Employee> employee) {
		Employee = employee;
	}
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", oName=" + oName + ", Employee=" + Employee + "]";
	}
	
	
	

}
