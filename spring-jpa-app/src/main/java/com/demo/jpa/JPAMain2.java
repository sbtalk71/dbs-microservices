package com.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.demo.jpa.entity.Emp;

public class JPAMain2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			Emp emp = em.find(Emp.class, 204);
			System.out.println(emp.getName()+" "+emp.getSalary());
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
			
		}

	}

}
