package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.utils.DBUtil;

public class PSDemoUsingUtilMethod {

	public static void main(String[] args) {

		Connection con = DBUtil.getMySQLConnection();
		try {
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM employee.employeedetails where empid= ? AND empname = ? ");
			ps.setInt(1, 1);
			ps.setString(2, "Ram");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
