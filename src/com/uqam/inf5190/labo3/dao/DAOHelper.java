package com.uqam.inf5190.labo3.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOHelper {
	private String url;
	private String user;
	private String password;
	
	public DAOHelper() {
		url = "jdbc:mysql://localhost:3306/inf5190";
		user = "root";
		password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

}
