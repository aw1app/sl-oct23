package com.ecommerce.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class loads the driver and also creates and stores a connection object.
// This connection obj can be then shared across multiple servlets.
public class JDBCUtil {

	private static Connection connection=null;

	public JDBCUtil(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		if(connection==null)
		connection = DriverManager.getConnection(dbURL, user, pwd);
	}

	public Connection getConnection() {
		return connection;
	}

	public void closeConnection() throws SQLException {
		if (connection != null)
			connection.close();
	}

}
