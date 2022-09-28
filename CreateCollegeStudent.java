package com.start;

import java.util.Scanner;

import com.entity.CollegeStudent;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CreateCollegeStudent {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		CollegeStudent c=new CollegeStudent();
		
		//System.out.println("enter the student id");
		//c.setSid(sc.nextInt());
		System.out.println("enter the student name");
		c.setSname(sc.next());
		System.out.println("enter the student department name");
		c.setDeptname(sc.next());
		System.out.println("enter the student address");
		c.setAddress(sc.next());
		System.out.println("enter the student marks");
		c.setMarks(sc.nextInt());
		System.out.println("enter the student age");
		c.setAge(sc.nextInt());
		
		//Create session factory object
				SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
				
				  //getting session object from session factory
				  Session session = sessionFactory.openSession();
				  
				//getting transaction object from session object
				  session.beginTransaction();
				  
				  session.save(c);
				  System.out.println("Inserted Successfully");
				  session.getTransaction().commit();
				  session.close();
				  sessionFactory.close();
		
	}

}
