package com.demo.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.spring.Emp;

@Repository
public class EmpDaoJdbcImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		
		return "JDBC: emp saved with id "+e.getEmpId();
	}

}
