package com.demo.spring.service;

import com.demo.spring.Emp;
import com.demo.spring.dao.EmpDao;

public class EmpService {

	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String loc, double salary) {

		String resp = dao.save(new Emp(id, name, loc, salary));
		return resp;
	}
}
