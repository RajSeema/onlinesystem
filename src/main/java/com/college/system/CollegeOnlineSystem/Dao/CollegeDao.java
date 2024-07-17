package com.college.system.CollegeOnlineSystem.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.system.CollegeOnlineSystem.Entity.College;


@Repository
public class CollegeDao {
	@Autowired
	SessionFactory factory;
	public void  insertData(College college ) {
		Session session =factory.openSession();
		Transaction Tx=session.beginTransaction();
		session.save(college);
		Tx.commit();
	}
	
	public void updateData(College college) {
		Session session =factory.openSession();
		Transaction Tx=session.beginTransaction();
		session.update(college);
		Tx.commit();
	}
	public College  getByIdData(int regNo) {
		Session session=factory.openSession();
		Transaction Tx= session.beginTransaction();
		College college =session.get(College.class,regNo);
		return college;
	}
	

	public void deleteById(int regNo) {
		Session session =factory.openSession();
		Transaction Tx=session.beginTransaction();
		session.delete(regNo);
		Tx.commit();		
	}

}
