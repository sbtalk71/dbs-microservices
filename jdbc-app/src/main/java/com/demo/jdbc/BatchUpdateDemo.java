package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3305/springdb", "root", "admin");

			stmt = conn.createStatement();
			stmt.addBatch("insert into employee(empno,name,address,salary) values (301,'Manish','Bangalore',35000)");
			stmt.addBatch("insert into employee(empno,name,address,salary) values (302,'Meraj','Bangalore',35000)");
			stmt.addBatch("insert into employee(empno,name,address,salary) values (100,'Gita','Bangalore',75000)");
			stmt.addBatch("insert into employee(empno,name,address,salary) values (304,'Sita','Bangalore',35000)");

			// start transction
			conn.setAutoCommit(false);
			int[] rows = stmt.executeBatch();
			
			conn.commit();

			System.out.println(rows.length + " inserted..");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			try {
				conn.rollback();
				System.out.println("Rolled back..");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
