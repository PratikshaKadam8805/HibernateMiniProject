package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CollegeStaff")
public class CollegeStaff 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="staffid")
		private int staffid;
	
	 @Column(name="staffname")
		private String staffname;
	 
	 @Column(name="staffdeptname")
		private String staffdeptname;
	 
	 @Column(name="address")
		private String address;
	 
	 @Column(name="mobileno")
		private long mobileno;
	 
	 @Column(name="salary")
		private double salary;
		
		public CollegeStaff()
		{
			
		}
		public CollegeStaff(int staffid, String staffname, String staffdeptname, String address, long mobileno,double salary) 
		{
			super();
			this.staffid = staffid;
			this.staffname = staffname;
			this.staffdeptname = staffdeptname;
			this.address = address;
			this.mobileno = mobileno;
			this.salary = salary;
		}

		public int getStaffid() {
			return staffid;
		}

		public void setStaffid(int staffid) {
			this.staffid = staffid;
		}

		public String getStaffname() {
			return staffname;
		}

		public void setStaffname(String staffname) {
			this.staffname = staffname;
		}

		public String getStaffdeptname() {
			return staffdeptname;
		}

		public void setStaffdeptname(String staffdeptname) {
			this.staffdeptname = staffdeptname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public long getMobileno() {
			return mobileno;
		}

		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
}
