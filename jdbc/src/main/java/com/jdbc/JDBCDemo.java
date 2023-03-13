package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {

		try {
			// Step 1 Load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 2 Connect with db using url user and pass
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavajdbc_01", "root", "root");
			
			// Step 3 create statement
			Statement stmt = con.createStatement();

			// Step 4 execute query
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			// extract data 
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
