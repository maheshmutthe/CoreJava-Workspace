package com.morningstar;

import java.util.List;
import java.util.Scanner;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.model.Employee;
import com.morningstar.service.EmployeeServiceImpl;

public class App2 {

	public static void main(String[] args) {

		System.out.println("**Welcome To Employee Management Application**");
		Scanner sc = new Scanner(System.in);
		

		int status = 0;
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		EmployeeDao dao = new EmployeeDaoImpl();
		service.setDao(dao);

		do {
			System.out.println(" 1. Add Employee");
			System.out.println(" 2. Read All Employees");
			System.out.println(" 3. Find By Id");
			System.out.println(" 4. Find by Name");
			System.out.println(" 5. Delete Employee");
			System.out.println(" 6. Update Employee");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Adding new Employee");
				System.out.println("Enter Employee Id");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.next();
				System.out.println("Enter Employee Salary");
				double salary = sc.nextDouble();
				System.out.println("Enter Department Id");
				int deptId = sc.nextInt();
				
				Employee employee=new Employee(id,name,salary,deptId);
				if(service.addEmployee(employee))
				{
					System.out.println("New Employee is Added !");
				}
				else {
					System.out.println("Error while adding new Employee");
				}
              
				System.out.println("Do you want to continue ! y | n ");
				String str=sc.next();
				if(str.equals("y"))
				{
					status=1;
				}
				else {
					status=0;
					System.out.println("Thank you !!!!!!!!!!!");
				}
				
				break;
					
			}
			case 2: {
                      System.out.println("********Employees Directory*********");
                      List<Employee> result=service.readAllEmployee();
                      for (Employee employee : result) {
                    		System.out.println(employee);
                    		System.out.println("-------------------------------------------------------");
                    	}

      				System.out.println("Do you want to continue ! y | n ");
      				String str=sc.next();
      				if(str.equals("y"))
      				{
      					status=1;
      				}
      				else {
      					status=0;
      					System.out.println("Thank you !!!!!!!!!!!");
      				}
      				
      				break;

			}
			case 3: {
                
				System.out.println("Finding Employee by ID");
				System.out.println("Enter the Employee Id");
				int id=sc.nextInt();
				
			Employee employee=service.findById(id);
			if(employee!=null)
			{
				System.out.println(employee);
			}
			else
				System.out.println("Employee not found with the id :"+id);
			
			System.out.println("Do you want to continue ! y | n ");
				String str=sc.next();
				if(str.equals("y"))
				{
					status=1;
				}
				else {
					status=0;
					System.out.println("Thank you !!!!!!!!!!!");
				}
				
				break;
			}
			case 4: {
				System.out.println("Finding Employee by Name");
				System.out.println("Enter the Employee Name");
		    String name=sc.next();
				
			Employee employee=service.findByName(name);
			if(employee!=null)
			{
				System.out.println(employee);
			}
			else
				System.out.println("Employee not found with the id :"+name);
			
			System.out.println("Do you want to continue ! y | n ");
				String str=sc.next();
				if(str.equals("y"))
				{
					status=1;
				}
				else {
					status=0;
					System.out.println("Thank you !!!!!!!!!!!");
				}
				break;
			}
			case 5: {
				System.out.println("Deleting Employee");
				System.out.println("Enter the employee id");
				int id=sc.nextInt();
				if(service.deleteEmployee(id))
				{
					System.out.println("Employee deleted !");
				}
				else 
					System.out.println("Error While Deleting employee");
				
				System.out.println("Do you want to continue ! y | n ");
				String str=sc.next();
				if(str.equals("y"))
				{
					status=1;
				}
				else {
					status=0;
					System.out.println("Thank you !!!!!!!!!!!");
				}
				break;

			}
			case 6: {
				System.out.println("Updating Employee");
				System.out.println("Enter Employee Id");
				int id = sc.nextInt();
				System.out.println("Enter Employee Name");
				String name = sc.next();
				System.out.println("Enter Employee Salary");
				double salary = sc.nextDouble();
				System.out.println("Enter Department Id");
				int deptId = sc.nextInt();
				
				Employee employee=new Employee(id,name,salary,deptId);
				 
				if(service.updateEmployee(employee))
				{
					System.out.println("Employee Updated for Employee Id : "+id);
				}
				else
					System.out.println("Error While Updating Employee");
				
				System.out.println("Do you want to continue ! y | n ");
				String str=sc.next();
				if(str.equals("y"))
				{
					status=1;
				}
				else {
					status=0;
					System.out.println("Thank you !!!!!!!!!!!");
				}
				break;
			}

			}

		} while (status != 0);

	}

}
