package com.cdac.Springfirst.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.Springfirst.Bean.Student;
import com.cdac.Springfirst.dao.StudentDAO;
@Service
public class StudentServiceImpl implements StudentService{
     
	@Autowired
    StudentDAO studentDAO;

	@Override
	public Iterable<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
	      Optional<Student> opt = studentDAO.findById(id);
	      return opt.get();
	      
	}

	@Override
	public Student save(Student s) {
		// TODO Auto-generated method stub
		return studentDAO.save(s);
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
	      Optional<Student> opt = studentDAO.findById(s.getId());
	      Student fetchedstudent = opt.get();
	      fetchedstudent.setName(s.getName());
	      fetchedstudent.setAddress(s.getAddress());
	      
	      return studentDAO.save(fetchedstudent);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	       studentDAO.deleteById(id);
	}







}
