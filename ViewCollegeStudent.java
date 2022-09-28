package com.start;

import java.util.List;

import com.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.CollegeStudent;
import com.start.CreateCollegeStudent;

public class ViewCollegeStudent 
{

	public static void main(String[] args) 
	 {
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  Query <CollegeStudent> query = session.createQuery("from CollegeStudent");
		  List <CollegeStudent> student = query.list();
		  for(CollegeStudent c: student)
		  {
			  System.out.println("---------------All College Student Data---------------");
			  System.out.print(c.getSid());
				System.out.print("\t"+ c.getSname());
				System.out.print("\t"+ c.getDeptname());
				System.out.print("\t"+ c.getAddress());
				System.out.print("\t"+ c.getMarks());
				System.out.println("\t"+ c.getAge());
			 // System.out.println("Student Id:"+c.getSid()+",Student name:"+c.getSname()+",Department name:"+c.getDeptname()+", Address:"+c.getAddress()+",Marks:"+c.getMarks()+",Age:"+c.getAge());
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
 
		  }
}	

