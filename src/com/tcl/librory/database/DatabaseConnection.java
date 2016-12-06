package com.tcl.librory.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class DatabaseConnection {
	
	private static Connection connection;
	
	static {
		Properties properties = new Properties();
		try {
			properties.load(DatabaseConnection.class.getResourceAsStream("settings.properties"));
			Class.forName(properties.getProperty("database.driver")).newInstance();
			connection = DriverManager.getConnection(properties.getProperty("database.url") + properties.getProperty("database.name"),
					properties.getProperty("database.username"), properties.getProperty("database.password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
