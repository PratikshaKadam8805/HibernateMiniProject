package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CollegeStudent")
public class CollegeStudent 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
	 @Column(name="sname")
	private String sname;
	 
	 @Column(name="deptname")
	private String deptname;
	 
	 @Column(name="address")
	private String address;
	 
	 @Column(name="marks")
	private int marks;
	 
	 @Column(name="age")
	private int age;
	public CollegeStudent() 
	{
		
	}
	public CollegeStudent(int sid, String sname, String deptname, String address, int marks, int age)
	{
		super();
		this.sid = sid;
		this.sname = sname;
		this.deptname = deptname;
		this.address = address;
		this.marks = marks;
		this.age = age;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}