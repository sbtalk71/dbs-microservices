package com.demo.interfaces;

public interface DBConnection {

	String specVeraion="1.0 GA";
	
	public String connectionInfo();
	public String getDbVersion();
	public default String getMetaData() {throw new RuntimeException("not yet implemented");}
}
