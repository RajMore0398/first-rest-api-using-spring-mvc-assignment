package com.dolpin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dolphin.entity.Student;
import com.dolphin.entity.Subject;
import com.dolphin.service.StudentSubjectService;

@RestController
public class StudentSubjectController {

	@Autowired
	StudentSubjectService studentSubjectService;

	@PostMapping("/students")
	public String saveStudent(@RequestBody Student std) {

		if (studentSubjectService.saveStudent(std))

			return "student saved succefully in repository";
		else

			return "saved not save in repository";
	}

	@GetMapping("/students")
	public List<Student> getStudent() {
		System.out.println("request received to get list of Students");
		return studentSubjectService.getStudentlist();
	}

	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		System.out.println("request recieved to get student of id:" + id);

		Student retrivedStudent = studentSubjectService.getStudent(id);
		return retrivedStudent;
	}

	@GetMapping("/subjects")
	public List<Subject> getSubject() {
		System.out.println("request received to  subjectlist");
		return studentSubjectService.getSubjectlist();
	}
	
	@GetMapping("/students/{id}/subjects/{id}")
	public Subject getSubject(@PathVariable int id) {
		System.out.println("request recive to get subject of id:" + id);
		return studentSubjectService.getSubject(id);
	}
}
