package com.xworkz.perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class JdbcDriver {

	public static void main(String[] args) {
		
		String jdbcURL="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		
		String driverClass="com.mysql.jdbc.Driver";
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Connection to Database...");
		String query="INSERT into bank(id,name,branch,state) VALUES (1,'SBI','BTM','Karnataka')";
		String query1="INSERT into bank(id,name,branch,state) VALUES (2,'HDFC','BTM','Karnataka')";
		String query2="INSERT into bank(id,name,branch,state) VALUES (3,'ICICI','BTM','Karnataka')";
		
		String updateQuery="Update bank set branch ='BTM LAYOUT' where name='HDFC'";
		String deleteQuery="delete from bank where name='SBI'";
		try {
		Connection conn=DriverManager.getConnection(jdbcURL, userName, password);
			System.out.println("Connection to database is Successfull....");
		Statement stmt=conn.createStatement();
		stmt.execute(query);
		stmt.execute(query1);
		stmt.execute(query2);
		System.out.println("Executed Insert Query");
		stmt.execute(updateQuery);
		System.out.println("Executed Update Query");
		stmt.execute(deleteQuery);
		System.out.println("Executed Delete Query");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
