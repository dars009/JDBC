package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PSDemo {

	public static void main(String[] args) {

		try {
			// Step 1 Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2 Connect with db using url user and pass
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			System.out.println("connection successful");

			// Step 3 create statement
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM employee.employeedetails where empid=? AND empname = ? ");
			ps.setInt(1, 1);
			ps.setString(2, "Ram");

			ResultSet rs = ps.executeQuery();

			System.out.println("Query executed");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
