package com.cdac.Springfirst.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.Springfirst.Bean.Student;

@Repository
public interface StudentDAO extends CrudRepository<Student, Integer>{
	

}
