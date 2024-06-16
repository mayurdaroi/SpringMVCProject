package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.idao.DaoInterface;
import com.cjc.iservice.ServiceInterface;
import com.cjc.model.Employee;

@Service
public class ServiceImpl implements ServiceInterface{

	@Autowired
	DaoInterface daointerface;
	@Override
	public int saveEmployee(Employee emp) {
		System.out.println(emp.getId());
		return daointerface.saveEmployee(emp);
	}

}
