package com.demo.db.impl;

import com.demo.interfaces.DBConnection;

public class OracleDB implements DBConnection {

	@Override
	public String connectionInfo() {
		
		return "Oracle DB Connection Active";
	}

	@Override
	public String getDbVersion() {
		
		return "19c";
	}

	
}
