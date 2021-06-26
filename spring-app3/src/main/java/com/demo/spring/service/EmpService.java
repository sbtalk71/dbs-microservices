package com.demo.spring.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.Emp;
import com.demo.spring.dao.EmpDao;

@Service
public class EmpService {

	@Autowired
	@Qualifier("empDaoJpaImpl")
	private EmpDao dao;

	/*
	 * public void setDao(EmpDao dao) { this.dao = dao; }
	 */

	@Autowired
	Set<Emp> empSet;

	public String registerEmp(int id, String name, String loc, double salary) {
		System.out.println("No of Emps " + empSet.size());
		String resp = dao.save(new Emp(id, name, loc, salary));
		return resp;
	}

}
