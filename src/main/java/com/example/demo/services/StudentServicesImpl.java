package com.example.demo.services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentRepository studentrepository;
	
	@Override
	public ArrayList<StudentEntity> findAllStudent() { 
        return (ArrayList<StudentEntity>) studentrepository.findAll(); 
    } 

	@Override
	public void Add(StudentEntity studententity) {
		studentrepository.save(studententity); 
		
	}

	@Override
	public void Delete(int S_Id) {
		studentrepository.deleteById(S_Id);
		
	}

	@Override
	public void Update(StudentEntity studententity) {
		StudentEntity student
        = studentrepository.findById(studententity.getS_Id()).get();
             
		student.setFirstname(studententity.getFirstname());
		studentrepository.save(student);
		
	}

}
