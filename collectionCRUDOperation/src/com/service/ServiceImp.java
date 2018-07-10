package com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.exception.Avalibilty;
import com.model.Employee;
import com.model.Organization;

public class ServiceImp {
	
	private static final List<Organization> org =new ArrayList<>();
	
	static {
		Employee e1=new Employee(11, "cuttack", 2100000);
		Employee e2=new Employee(21, "bhubaneswar", 90000);
		Employee e3=new Employee(33, "dhenkanal", 1100000);
		Employee e4=new Employee(9, "puri", 1500000);
		Employee e5=new Employee(19, "baleswar", 1200000);
		Employee e6=new Employee(25, "bhadrak", 1400000);
		
		Organization org1=new Organization(111, "Odisha1", new ArrayList<>(Arrays.asList(e1,e2,e3)));
		Organization org2=new Organization(114, "Odisha2", new ArrayList<>(Arrays.asList(e2,e3,e4)));
		Organization org3=new Organization(112, "Odisha3", new ArrayList<>(Arrays.asList(e4,e5,e6)));
		
		org.add(org1);
		org.add(org2);
		org.add(org3);
	}
	
	public static  void getAllDetails(int id) {
		for(Organization oo:org) {
			if(oo.getOrgId()==id) {
				System.out.println(oo.getoName()+" "+oo.getEmployee());
				
				
			}else {
				throw new Avalibilty("sorry organization not avialble");
			}
		}
		

		
	}
	
	public List<Employee> getEmp(int id) {
		getAllDetails(id);
		if(id==0) {
			throw new Avalibilty("current id is not avilable..");
	  }
		return ((Organization) getEmp(id)).getEmployee();
		
	}
	
//	public Employee getAllEmp(int oid, int eid) {
//		getAllDetails(oid);
//		if(oid==0) {
//			throw new Avalibilty("orgnization is not avilable..")
//		}
//		for(Employee e:getAllDetails(oid).getEmployee())
//		
//		
//	}

}
