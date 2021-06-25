package com.demo.jdbc.dao;

public class DaoMain {

	public static void main(String[] args) {
		try {
			EmpDao dao = new EmpDaoImpl();
			//Emp e = dao.findById(1050);

			//System.out.println(e);

			for (Emp emp : dao.listAll()) {

				System.out.println(emp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
