package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.jdbc.utils.DBUtil;

public class MetaDataDemo {

	public static void getMetaData() {
		Connection con = DBUtil.getMySQLConnection();
		try {
			DatabaseMetaData dm=con.getMetaData();
			System.out.println(dm.getDriverName());
			System.out.println(dm.getDriverVersion());
			System.out.println(dm.getMaxTablesInSelect());
			System.out.println(dm.getUserName());
			System.out.println(dm.getNumericFunctions());
			System.out.println(dm.getStringFunctions());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error while fetch Metadata");
		}
	}

	public static void main(String[] args) {
		MetaDataDemo.getMetaData();

	}
}
