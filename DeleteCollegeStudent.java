package com.start;

import java.util.Scanner;

import com.entity.CollegeStudent;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteCollegeStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		  CollegeStudent c=new CollegeStudent();
		  
		System.out.println("enter the student id");
		c.setSid(sc.nextInt());
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction(); 
		 session.delete(c);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}
