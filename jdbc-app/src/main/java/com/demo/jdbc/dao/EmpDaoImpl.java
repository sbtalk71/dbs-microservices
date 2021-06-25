package com.demo.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

	@Override
	public Emp findById(int id) {
		Emp emp = null;
		try {
			PreparedStatement pst = getConnection().prepareStatement("select * from employee where empno=?");
			pst.setInt(1, id);

			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				emp = new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (emp == null)
			throw new RuntimeException("Emp Not Found ..");
		return emp;
	}

	@Override
	public String save(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp update(Emp e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> listAll() {
		List<Emp> list = new ArrayList<>();
		Connection conn=null;
		try {
			conn= getConnection();
			PreparedStatement pst =
					conn.prepareStatement("select * from employee");

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"),
						rs.getDouble("SALARY")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(conn);
		}
		return list;
	}

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3305/springdb", "root", "admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}

		return conn;
	}

	public void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
