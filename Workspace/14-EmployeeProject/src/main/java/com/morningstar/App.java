package com.morningstar;

import java.util.List;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.model.Employee;
import com.morningstar.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
       EmployeeServiceImpl service=new EmployeeServiceImpl();
       EmployeeDao dao=new EmployeeDaoImpl();
       service.setDao(dao);
       
     //  Employee employee=new Employee(102,"Mahesh",10000,30);
      
List<Employee> result=service.readAllEmployee();
       
     //  System.out.println(service.addEmployee(employee));

for (Employee employee : result) {
	System.out.println(employee);
}
      
	}      
    
}
