package com.demo.jdbc.dao;

import java.util.List;

public interface EmpDao {

	Emp findById(int id);
	String save(Emp e);
	Emp update(Emp e);
	String delete(int id);
	List<Emp> listAll();
}
