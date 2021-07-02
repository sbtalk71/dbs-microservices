package com.demo.spring;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.TransactionManager;

@Configuration
@ComponentScan(basePackages = "com.demo")
public class JpaConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.mariadb.jdbc.Driver");
		ds.setUrl("jdbc:mariadb://localhost:3305/springdb");
		ds.setUsername("root");
		ds.setPassword("admin");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds) {
		LocalContainerEntityManagerFactoryBean lc = new LocalContainerEntityManagerFactoryBean();
		lc.setDataSource(ds);
		lc.setPackagesToScan("com.demo.jpa.entity");

		HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
		va.setDatabase(Database.MYSQL);
		va.setShowSql(true);
		lc.setJpaVendorAdapter(va);
		return lc;
	}

	@Bean
	public TransactionManager transactionManager(EntityManagerFactory emf) {

		JpaTransactionManager txm = new JpaTransactionManager();
		txm.setEntityManagerFactory(emf);
		return txm;
	}

}
