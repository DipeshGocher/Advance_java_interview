package com.rays.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureOut {

	public static void main(String[] args) throws Exception {
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");
		CallableStatement cs = conn.prepareCall("{call empOut(?)}");
		
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		
//		int resultValue = cs.getInt(1);
//		System.out.println("data " + resultValue);
		System.out.println(cs.getInt(1));
	
	}
}
