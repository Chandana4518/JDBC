package com.xworkz.door;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Player {
	public static void main(String[] args) {
		selectByName();
		selectByBank();
	}

	public static void selectByName() {
		System.out.println("selectByName method........");
		String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";

		String driverClass = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Connection to Database...");
		String SelectQuery = "SELECT * from bank where Name='HDFC'";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection to database is Successfull....");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SelectQuery);
			if (rs.next()) {
				System.out.println(rs);
				System.out.println(rs.getString("Name"));
			}
			System.out.println("Executed Select Query");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void selectByBank() {
		System.out.println("selectByBank method........");
		String jdbcURL = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "Xworkzodc@123";

		String driverClass = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Connection to Database...");
		String SelectQuery = "SELECT * from bank";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection to database is Successfull....");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SelectQuery);
			while (rs.next()) {
				
				System.out.println(rs.getString(3));
			}
			System.out.println("Executed Select Query");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

