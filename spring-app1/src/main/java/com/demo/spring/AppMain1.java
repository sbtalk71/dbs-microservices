package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		
		Mail mail=(Mail)ctx.getBean("myMail");
		
		
		//System.out.println(mail.getMessage().getBody());
		
		System.out.println(mail.getFromAddress());
		
		mail.setFromAddress("Bill Gates");
		
	
		
		
		Mail mail1=ctx.getBean(Mail.class);
		
		System.out.println(mail1.getFromAddress());
		
		System.out.println("Is Singleton : "+(mail==mail1));

	}

}
