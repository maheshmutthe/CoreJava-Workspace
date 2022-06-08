package com.morningstar;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentService;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentService service = new StudentServiceImpl();
    	StudentDao studentDao = new StudentDaoImpl();
    	service.setDao(studentDao);
    	
    	Student student = new Student(100, "Mahesh", 95);
    	boolean result = service.addStudent(student);
    	
    	if(result)
    		System.out.println("Student is added into Databse");
    	else
    		System.out.println("Student is not added");
    	
    	
    }
}
