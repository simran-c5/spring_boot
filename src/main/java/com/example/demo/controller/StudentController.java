package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.services.StudentServices;
import com.example.demo.services.StudentServicesImpl;

@RestController
public class StudentController {
	
	@Autowired StudentServices studentservices;
	
	@GetMapping("/find")
	 public ArrayList<StudentEntity> findAllStudent(){
		 return studentservices.findAllStudent();
	 }
     
	@PostMapping("/add")
	 public void Add(@RequestBody StudentEntity studententity) {
		studentservices.Add(studententity);
	 }
	@GetMapping("/delete/{id}")
	 public void Delete(@PathVariable("id") int S_Id) {
		studentservices.Delete(S_Id);
		 
	 }
	
	@PutMapping("/update")
	 public void Update(@RequestBody StudentEntity studententity) {
		 studentservicesimpl.Update(studententity);
	 }
	
}
