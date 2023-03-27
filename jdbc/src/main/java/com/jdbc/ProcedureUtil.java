package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.jdbc.utils.DBUtil;

public class ProcedureUtil {

		public void callUpdateCity() {
			
			Connection con = DBUtil.getMySQLConnection();
			try {
				CallableStatement cs = con.prepareCall("call employee.update_city();");
				cs.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			ProcedureUtil pu= new ProcedureUtil();
			pu.callUpdateCity();
		}
}
