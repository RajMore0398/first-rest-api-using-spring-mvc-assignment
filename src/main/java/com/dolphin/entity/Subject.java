package com.dolphin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	String subjectName;
	@Column
	String ProfName;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String subjectName, String profName) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		ProfName = profName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getProfName() {
		return ProfName;
	}
	public void setProfName(String profName) {
		ProfName = profName;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", subjectName=" + subjectName + ", ProfName=" + ProfName + "]";
	}

	

}