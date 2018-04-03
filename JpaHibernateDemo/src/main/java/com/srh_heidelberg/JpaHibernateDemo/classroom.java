package com.srh_heidelberg.JpaHibernateDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclass;
	private String class_Name;	
	private int idTeacher;
	
	public int getIdclass() {
		return idclass;
	}
	public void setIdclass(int idclass) {
		this.idclass = idclass;
	}
	public String getClass_Name() {
		return class_Name;
	}
	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}
	@ManyToOne
	@JoinColumn(name = "idTeacher")
	public int getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	@Override
	public String toString() {
		return "classroom [idclass=" + idclass + ", class_Name=" + class_Name + ", idTeacher=" + idTeacher + "]";
	}

}
