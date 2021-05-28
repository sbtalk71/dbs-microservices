package com.demo.app;

import com.demo.db.impl.MySQLDB;
import com.demo.db.impl.OracleDB;
import com.demo.interfaces.DBConnection;

public class Main {

	public static void main(String[] args) {
		DBConnection conn=new OracleDB();
		
		System.out.println(conn.connectionInfo());
		System.out.println(conn.getDbVersion());
		System.out.println(DBConnection.specVeraion);
		System.out.println(conn.getMetaData());

	}

}
