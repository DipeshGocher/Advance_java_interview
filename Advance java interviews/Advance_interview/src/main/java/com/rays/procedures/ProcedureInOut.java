package com.rays.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class ProcedureInOut {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");
		CallableStatement cs = conn.prepareCall("{call empInOut(?,?)}");
		cs.setInt(1, 4);
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(2));
	}

}
