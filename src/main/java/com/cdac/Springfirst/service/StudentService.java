package com.cdac.Springfirst.service;


import com.cdac.Springfirst.Bean.Student;

public interface StudentService {
	public Iterable<Student> findAll();
	
	public Student findById(int id);
	
	public Student save(Student s);
	
	public Student update(Student s);
	
	public void delete(Integer id);

}
