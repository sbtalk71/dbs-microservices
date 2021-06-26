package com.demo.spring.dao;

import org.springframework.stereotype.Repository;

import com.demo.spring.Emp;

@Repository
public class EmpDaoJpaImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		
		return "JPA: emp saved with id "+e.getEmpId();
	}

}
