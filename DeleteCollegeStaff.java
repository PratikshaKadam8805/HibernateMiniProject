package com.start;

import java.util.Scanner;

import com.entity.CollegeStaff;
import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteCollegeStaff {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		CollegeStaff s=new CollegeStaff();
		
		System.out.println("enter the staff id");
		s.setStaffid(sc.nextInt());
		
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 session.delete(s);
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

}
