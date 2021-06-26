package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.service.EmpService;

public class AppMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmpService service=(EmpService)ctx.getBean("empService");
		
		String resp=service.registerEmp(10, "Shantanu", "Hyderbad", 56000);
		
		System.out.println(resp);

	}

}
