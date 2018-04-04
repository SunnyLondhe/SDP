package com.srh_heidelberg.JpaEclipseLinkDemo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Student_ID;
	private String Student_Name;
	private String Student_Address;
	private String Student_Contact;
	private int idclass;
	public int getIdclass() {
		return idclass;
	}
	public void setIdclass(int idclass) {
		this.idclass = idclass;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idclass", insertable = false, updatable = false)
	private classroom classroom;
	
	
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
				+ Student_Address + ", Student_Contact=" + Student_Contact + ", idClass=" + idclass + "]";
	}
	
}