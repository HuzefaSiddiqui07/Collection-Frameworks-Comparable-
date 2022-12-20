package com.collectionframeworks.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMainClass {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee (20, "Ram", 8000));
		al.add(new Employee (30, "SHYAM", 3000));
		al.add(new Employee (10, "radhe", 6000));
		
		Collections.sort(al);
		
		// Use For-Each loop
	for (Employee e : al) {
		System.out.println("Employee Id >> " + e.getEmpId() + "Employee Name >>> " + e.getEmpName() + "Employee Salary >>> " + e.getEmpSalary());
	}

	}

}
