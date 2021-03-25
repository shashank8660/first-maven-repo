package com.lti.view;

import com.lti.model.Employee;

public class Empview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp  = new Employee();
		
		emp.setEmp_id(1001);
		emp.setEmpName("Himankkkkkk");
		
		System.out.println("Id is :"+ emp.getEmp_id()+" name is: "+emp.getEmpName());
		
		

	}

}
