package com.college.system.CollegeOnlineSystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.college.system.CollegeOnlineSystem.Dao.CollegeDao;
import com.college.system.CollegeOnlineSystem.Entity.College;
@Component
public class CollegeService {
	@Autowired
	CollegeDao collegeDao;
	public void  insertData(College college) {
		 collegeDao.insertData(college);
	}
	public void updateData(College college) {
		
		collegeDao.updateData(college);
	}
	public College getByIdData(int regNo) {
		
		return collegeDao.getByIdData(regNo);
	}

	public void deleteById(int regNo) {
		
		 collegeDao.deleteById(regNo);
	}

}
