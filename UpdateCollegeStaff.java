package com.start;

import java.util.Scanner;

import com.entity.CollegeStaff;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateCollegeStaff
{
	public static void main(String[] args) 
	 {
		Scanner sc=new Scanner(System.in);
		
		CollegeStaff s=new CollegeStaff();
		
		System.out.println("enter the staff id");
		s.setStaffid(sc.nextInt());
		System.out.println("enter the staff name");
		s.setStaffname(sc.next());
		System.out.println("enter the staff department name");
		s.setStaffdeptname(sc.next());
		System.out.println("enter the staff address");
		s.setAddress(sc.next());
		System.out.println("enter the staff mobile number");
		s.setMobileno(sc.nextLong());
		System.out.println("enter the staff salary");
		s.setSalary(sc.nextDouble());
		  
		//Create session factory object
				SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
				
				  //getting session object from session factory
				  Session session = sessionFactory.openSession();
				  
				//getting transaction object from session object
				  session.beginTransaction();
				  
				  session.saveOrUpdate(s);;
				  System.out.println("Updated Successfully");
				  session.getTransaction().commit();
				  session.close();
				  sessionFactory.close();
	 }
}
