package com.demo.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.jpa.entity.Emp;

@Repository
public class EmpDaoJpaImpl implements EmpDao {

	//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Emp findById(int id) {
		//EntityManager em = emf.createEntityManager();
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
	@Transactional
	public String save(Emp e) {
		
		String message = "";
		try {
			Emp emp = em.find(Emp.class, e.getEmpId());
			if (emp == null) {
				em.persist(e);
				message = "Emp Saved";
			} else {
				message = "Emp already exists";
			}
		} catch (Exception e2) {
			
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
