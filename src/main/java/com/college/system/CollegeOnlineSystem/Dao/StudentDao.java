package com.college.system.CollegeOnlineSystem.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.system.CollegeOnlineSystem.Entity.Student;
@Repository
public class StudentDao {
	@Autowired
	SessionFactory factory;
	public void UpdateStud(Student student) {
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(student);
		tx.commit();
	}

}
