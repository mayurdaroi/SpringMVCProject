package com.cjc.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.idao.DaoInterface;
import com.cjc.model.Employee;

@Repository
public class DaoImpl implements DaoInterface{

	@Autowired
	SessionFactory sf;
	@Override
	public int saveEmployee(Employee emp) {
		Session session=sf.openSession();
		int id=(Integer)session.save(emp);
		session.beginTransaction().commit();
		System.out.println(emp.getId());
		System.out.println(id);
		return id;
	}

	
	
}
