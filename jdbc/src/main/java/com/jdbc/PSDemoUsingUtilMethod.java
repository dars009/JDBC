package com.jdbc;

import com.pojo.EmployeeDetails;

public class PSDemoUsingUtilMethod {

	public static void main(String[] args) {

		CRUDDemo cd = new CRUDDemo();
		
		System.out.println(cd.getTotalDataCount());
		// Read Employee table
		System.out.println("-----------READ Operation------------");
		//cd.readEmployee();
		
		// Insert Employee
		System.out.println("-----------Write Operation------------");
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmpid(12);
		emp.setEmpname("abcd");
		emp.setEmpcity("Mumbai");
		//cd.createEmployee(emp);

		System.out.println("-----------Update Operation------------");
		EmployeeDetails empU = new EmployeeDetails();
		empU.setEmpid(14);
		empU.setEmpname("Updated EMployee");
		//cd.updateEmployee(empU);
		
		
		cd.deleteEmployee(4);
		
		
		
		
		
	}
}
