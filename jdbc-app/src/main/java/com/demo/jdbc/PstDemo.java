package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PstDemo {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String emp_query ="select * from employee where salary between ? and ?";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3305/springdb", "root", "admin");
			
			pst=conn.prepareStatement(emp_query);
			pst.setDouble(1, 20000);
			pst.setDouble(2, 50000);
			
			rs=pst.executeQuery();
		
			
			while(rs.next()) {
				System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getDouble("SALARY"));
			}
			
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
