package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.jpa.dao.EmpDao;

public class SpringJpaMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
		
		EmpDao dao=ctx.getBean(EmpDao.class);
		
		System.out.println(dao.findById(105).getName());
	}

}
