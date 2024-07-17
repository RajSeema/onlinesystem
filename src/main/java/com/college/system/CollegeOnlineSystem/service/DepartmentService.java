package com.college.system.CollegeOnlineSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.college.system.CollegeOnlineSystem.Dao.DepartmentDao;
import com.college.system.CollegeOnlineSystem.Entity.Department;
@Component
public class DepartmentService {
	@Autowired
	DepartmentDao departmentDao;

	public void insertData(Department department) {
		departmentDao.insertData(department);
		
	}

}
