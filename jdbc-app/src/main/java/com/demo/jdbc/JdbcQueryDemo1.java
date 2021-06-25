package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.mariadb.jdbc.Driver;

public class JdbcQueryDemo1 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String emp_query ="select * from employee";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3305/springdb", "root", "admin");
			System.out.println(conn.getClass().getName());
			//DatabaseMetaData
			DatabaseMetaData dbmd=conn.getMetaData();
			
			System.out.println(dbmd.getMaxConnections());
			System.out.println(dbmd.getDatabaseProductName());
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(emp_query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("EMPNO")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getDouble("SALARY"));
			}
			
			
			//ResultSetMetaData
			ResultSetMetaData rsmd=rs.getMetaData();
			
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(2));
			
			for(int i=1;i<rsmd.getColumnCount()+1;i++) {
				System.out.println(rsmd.getColumnName(i));
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
