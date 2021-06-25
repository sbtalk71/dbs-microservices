package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PstInsertDemo {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;
		String emp_query ="insert into employee(empno,name,address,salary) values (?,?,?,?)";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3305/springdb", "root", "admin");
			
			pst=conn.prepareStatement(emp_query);
			
			pst.setInt(1,201);
			pst.setString(2,"Scott");
			pst.setString(3,"Chennai");
			pst.setDouble(4,78000);
			
			int count=pst.executeUpdate();
			System.out.println("rows inserted : "+count);
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
