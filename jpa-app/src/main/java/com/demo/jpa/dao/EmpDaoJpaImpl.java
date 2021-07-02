package com.demo.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.jpa.entity.Emp;

public class EmpDaoJpaImpl implements EmpDao {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");

	@Override
	public Emp findById(int id) {
		EntityManager em = emf.createEntityManager();
		Emp emp = em.find(Emp.class, id);
		if (emp != null) {
			return emp;
		} else {
			throw new RuntimeException("Emp Not found");
		}

	}

	@Override
	public List<Emp> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Emp e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		String message = "";
		try {
			Emp emp = em.find(Emp.class, e.getEmpId());
			if (emp == null) {

				tx.begin();
				em.persist(e);
				tx.commit();
				message = "Emp Saved";
			} else {
				message = "Emp already exists";
			}
		} catch (Exception e2) {
			tx.rollback();
			e2.printStackTrace();
		} finally {
			em.close();
		}

		return message;
	}

	@Override
	public String update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delet(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
