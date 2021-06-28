package com.demo.jdbc.dao;

public class DaoMain2 {

	public static void main(String[] args) {
		try {
			EmpDao dao = new EmpDaoImpl();
			Emp e = new Emp(401, "Sanjay", "Bangalore", 78000);
			String resp = dao.save(e);
			System.out.println(resp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
