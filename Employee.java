package com.collectionframeworks.comparable;

public class Employee implements Comparable<Employee>{
	
	// Declare
	int empId;
	String empName;
	int empSalary;
	
	// Create Parameterized Constructor
	public Employee(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	// Use Getter & Setter 

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	// Sort data by using compareTo Method
    @Override
	public int compareTo(Employee employee) {
		
    	if (empId > employee.empId)
    	return 1; // Condition 01
    	
    	if (empId < employee.empId)
    		return -1; // Condition 02
    	
    	else 
    		return 0; // Condition 03
    }
	
}
