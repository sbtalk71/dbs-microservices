package com.demo.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {  
        public static void main(String[] args) throws Exception {  
                 Class.forName("org.mariadb.jdbc.Driver");  
      
    //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mariadb://localhost:3305/springdb");  
        rowSet.setUsername("root");  
        rowSet.setPassword("admin");  
                   
        rowSet.setCommand("select * from employee");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getString(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                        System.out.println("Salary: " + rowSet.getString(4));  
                }  
                 
        }  
}  