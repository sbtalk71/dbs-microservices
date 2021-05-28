package com.demo.db.impl;

import com.demo.interfaces.DBConnection;

public class MySQLDB implements DBConnection {

	@Override
	public String connectionInfo() {
		
		return "MySQL DB Connection Active";
	}

	@Override
	public String getDbVersion() {
		
		return "8.0.1";
	}

	
}
