package com.morningstar.model;

public class Employee {
private int EmployeeId;
private String EmployeeName;
private double EmployeeSalary;
private int DepartmentId;
public Employee(int employeeId, String employeeName, double employeeSalary, int departmentId) {
	super();
	EmployeeId = employeeId;
	EmployeeName = employeeName;
	EmployeeSalary = employeeSalary;
	DepartmentId = departmentId;
}
@Override
public String toString() {
	return "EmployeeId :" + EmployeeId + ", EmployeeName :" + EmployeeName + ", EmployeeSalary :"
			+ EmployeeSalary + ", DepartmentId :" + DepartmentId ;
}
public int getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public double getEmployeeSalary() {
	return EmployeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	EmployeeSalary = employeeSalary;
}
public int getDepartmentId() {
	return DepartmentId;
}
public void setDepartmentId(int departmentId) {
	DepartmentId = departmentId;
}
}
