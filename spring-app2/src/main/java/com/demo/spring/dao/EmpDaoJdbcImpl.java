package com.demo.spring.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.demo.spring.Emp;

public class EmpDaoJdbcImpl implements EmpDao, BeanNameAware, ApplicationContextAware {

	@Override
	public String save(Emp e) {

		return "JDBC: emp saved with id " + e.getEmpId();
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name is " + name);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(applicationContext.containsBean("dao"));

	}

}
