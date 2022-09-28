package com.start;

import java.util.List;

import com.entity.CollegeStaff;
import com.entity.CollegeStudent;
import com.utility.HibernateUtility;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ViewCollegeStaff {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		  Query <CollegeStaff> query = session.createQuery("from CollegeStaff");
		  List <CollegeStaff> staff = query.list();
		  for(CollegeStaff s: staff)
		  {
			  System.out.println("=============================College Staff Data================");
				System.out.print(s.getStaffid());
				System.out.print("\t"+ s.getStaffname());
				System.out.print("\t"+ s.getStaffdeptname());
				System.out.print("\t"+ s.getAddress());
				System.out.print("\t"+ s.getMobileno());
				System.out.println("\t"+ s.getSalary());  
		  }
		  System.out.println("View Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
	}

}
