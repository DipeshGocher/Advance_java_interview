package com.rays.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoreFunction {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");
		CallableStatement cs = conn.prepareCall("{? = call square1(?)}");
		cs.setInt(2, 10);
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(1));
		
	}

}
