package com.jbk.GetMapping.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PutMapping;

import com.jbk.GetMapping.entity.Team;

@Repository
public class Dao {
	
	@Autowired
	SessionFactory factory;
	
	
	public String add(Team t) {
		
		Session session = null;
		Transaction  tx=null;
		String msg=null;
		
		try {
			session= factory.openSession();
			session.beginTransaction();
			
			session.persist(t);
			tx.commit();
			msg="record are added succefully";
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			
		}
		finally {
			if(session !=null) {
				session.close();
			}
			return msg;
		}
		

		
	}
}
