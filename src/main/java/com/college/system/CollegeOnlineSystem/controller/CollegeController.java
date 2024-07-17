package com.college.system.CollegeOnlineSystem.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.system.CollegeOnlineSystem.Entity.College;
import com.college.system.CollegeOnlineSystem.Entity.Department;
import com.college.system.CollegeOnlineSystem.Entity.Student;
import com.college.system.CollegeOnlineSystem.service.CollegeService;
import com.college.system.CollegeOnlineSystem.service.DepartmentService;
import com.college.system.CollegeOnlineSystem.service.StudentService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@PostMapping(path = "/InsertData",consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public void  InsertData(@RequestBody College college)
	{
		
		 collegeService.insertData(college);
	}
	
	@GetMapping("getCollegeId/{regNo}")
		public College getById(@PathVariable int regNo)
	{
		return collegeService.getByIdData(regNo);
	}

	@PutMapping("updateData")
	public void updateData(@RequestBody College college)
	{
		collegeService.updateData(college);
	}
	
	@DeleteMapping("DeleteRecord/{regNo}")
	public void deleteById(@PathVariable int regNo)
	{
		  collegeService.deleteById(regNo);
	}

	//---------------Department
	
	@Autowired 
	DepartmentService departmentService;
	@PostMapping("InsertDepartment")
	
	public void insertData(@RequestBody Department department) {
		departmentService.insertData(department);
	}
	
	@Autowired 
	StudentService studentService;
	@PutMapping("UpdateStudent")
	
	public void updateStudent(@RequestBody Student student)
	{
		studentService.UpdateStud(student);
	}
	

}
