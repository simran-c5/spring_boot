package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.entity.StudentEntity;

public interface StudentServices {
	 ArrayList<StudentEntity> findAllStudent();
      
 void Add(StudentEntity studententity);
 void Delete(int S_Id);
 void Update(StudentEntity studententity);


	
}
