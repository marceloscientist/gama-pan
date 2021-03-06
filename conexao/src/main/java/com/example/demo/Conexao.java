package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		String hostName = null;
		String userName = null; 
		String password = null; 
		String url = null;
		String jdbcDriver = null;
		String dataBaseName = null;
		String dataBasePrefix = null;
		String dataBasePort = null;

		hostName = "database-1.cjrriz7oygwx.us-west-2.rds.amazonaws.com";
		userName = "admin";
		password = "12345678";
		jdbcDriver = "com.mysql.cj.jdbc.Driver";
		dataBaseName = "dblambda";
		dataBasePrefix = "jdbc:mysql://";
		dataBasePort = "3306";
		
		url = dataBasePrefix + hostName + ":" + dataBasePort + "/" + dataBaseName;
		Class.forName(jdbcDriver);
		con = DriverManager.getConnection(url, userName, password);
		
		con.close();
	}
}
