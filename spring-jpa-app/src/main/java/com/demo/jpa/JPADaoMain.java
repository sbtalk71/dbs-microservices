package com.demo.jpa;

import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.jpa.dao.EmpDao;
import com.demo.jpa.dao.EmpDaoJpaImpl;
import com.demo.jpa.entity.Emp;

public class JPADaoMain {

	public static void main(String[] args) {

		EmpDao dao = new EmpDaoJpaImpl();
/*
		Function<Integer, Emp> fref = (x) -> {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");
			EntityManager em = emf.createEntityManager();
			Emp emp = em.find(Emp.class, x);
			if (emp != null) {
				return emp;
			} else {
				throw new RuntimeException("Emp Not found");
			}

		};

		System.out.println(fref.apply(104).getName());
		*/

		System.out.println(dao.save(new Emp(503, "Nihar", "Bhopal", 90000)));

	}

}
