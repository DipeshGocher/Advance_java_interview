package com.rays.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("insert into marksheet values(1,'aryant', 89, 90, 10)");

		System.out.println("data inserted => " + i);
	}
}
