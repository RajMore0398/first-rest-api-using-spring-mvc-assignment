package com.dolphin.service;
import java.util.List;

import com.dolphin.entity.Student;
import com.dolphin.entity.Subject;

public interface StudentSubjectService {

public boolean saveStudent(Student std);
	
	public List<Student>getStudentlist();
	
	public List<Subject>getSubjectlist();
	
	public Student getStudent(int id);
	
	public Subject getSubject(int id);
}