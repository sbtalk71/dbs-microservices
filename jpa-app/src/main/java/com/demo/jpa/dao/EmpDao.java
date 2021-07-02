package com.demo.jpa.dao;

import java.util.List;

import com.demo.jpa.entity.Emp;

public interface EmpDao {

	public Emp findById(int id);

	public List<Emp> listAll();

	public String save(Emp e);

	public String update(Emp e);

	public String delet(int id);

}
