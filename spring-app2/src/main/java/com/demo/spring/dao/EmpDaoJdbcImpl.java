package com.demo.spring.dao;

import com.demo.spring.Emp;

public class EmpDaoJdbcImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		
		return "JDBC: emp saved with id "+e.getEmpId();
	}

}
