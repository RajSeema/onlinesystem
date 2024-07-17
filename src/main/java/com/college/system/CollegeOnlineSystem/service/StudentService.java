package com.college.system.CollegeOnlineSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.college.system.CollegeOnlineSystem.Dao.StudentDao;
import com.college.system.CollegeOnlineSystem.Entity.Student;
@Component
public class StudentService {
@Autowired
StudentDao studentDao;
	public void UpdateStud(Student student) {
		studentDao.UpdateStud(student);
		
	}

}
