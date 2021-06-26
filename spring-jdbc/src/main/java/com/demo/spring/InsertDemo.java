package com.demo.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class InsertDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);

		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

		/*int count = jt.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {

				PreparedStatement pst = con
						.prepareStatement("insert into employee(empno,name,address,salary) values(?,?,?,?)");
				pst.setInt(1, 203);
				pst.setString(2, "Gopal");
				pst.setString(3, "Hyderabad");
				pst.setDouble(4, 56000);
				return pst;
			}
		});*/

		int count = jt.update((con) ->{

				PreparedStatement pst = con
						.prepareStatement("insert into employee(empno,name,address,salary) values(?,?,?,?)");
				pst.setInt(1, 203);
				pst.setString(2, "Gopal");
				pst.setString(3, "Hyderabad");
				pst.setDouble(4, 56000);
				return pst;
			}
		);
		System.out.println("Data inserted with count "+count);
	}

}
