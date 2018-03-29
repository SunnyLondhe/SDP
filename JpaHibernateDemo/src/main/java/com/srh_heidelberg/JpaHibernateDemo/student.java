package com.srh_heidelberg.JpaHibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private int Student_ID;
	private String Student_Name;
	private String Student_Address;
	private String Student_Contact;
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_Address() {
		return Student_Address;
	}
	public void setStudent_Address(String student_Address) {
		Student_Address = student_Address;
	}
	public String getStudent_Contact() {
		return Student_Contact;
	}
	public void setStudent_Contact(String student_Contact) {
		Student_Contact = student_Contact;
	}
	@Override
	public String toString() {
		return "student [Student_ID=" + Student_ID + ", Student_Name=" + Student_Name + ", Student_Address="
				+ Student_Address + ", Student_Contact=" + Student_Contact + "]";
	}
	
}
