package com.college.system.CollegeOnlineSystem.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.system.CollegeOnlineSystem.Entity.Department;

@Repository
public class DepartmentDao {
	@Autowired
	SessionFactory factory;



	public void insertData(Department department) {
		Session session=factory.openSession();
		Transaction Tx=session.beginTransaction();
		session.save(department);
		Tx.commit();
		
	}

}
