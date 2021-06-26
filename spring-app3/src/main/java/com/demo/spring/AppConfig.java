package com.demo.spring;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class AppConfig {

	@Bean
	public Set<Emp> empSet(){
		Set<Emp> empset=new HashSet<>();
		empset.add(new Emp());
		empset.add(new Emp());
		empset.add(new Emp());
		return empset;
	}
	
}
