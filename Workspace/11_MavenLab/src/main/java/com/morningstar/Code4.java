package com.morningstar;

import java.util.*;
public class Code4 {

	public static String month(int n)
	{
		switch(n) {
		
        case 0:
        {
        
        	return "January";
        }
        case 1:
        {
        
        	return "February";
        
        } 
        case 2:
        {
        
          	return "March";
        } 
        case 3:
        {
        	return "April";
        } 
        case 4:
        {
        	return "May";
        } 
        case 5:
        {
        	return "June";
        } 
        case 6:
        {
        	return "July";
        } 
        case 7:
        {
        return "Augest";
        } 
        case 8:
        {
        	return "September";
        }
        case 9:
        {
        	return "October";
        }
        case 10:
        {
        return "November";
        } 
        case 11:
        {
        	return "December";
        }
        
       
        }
		return "";
		
	}
	
	public static void main(String[] args) {
	
		String arr[]= {"January","February","March","April","May","June","July","Augest","September","October","November","December"};
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
     System.out.println(  Code4.month(n));
       
        
        
	}

}
