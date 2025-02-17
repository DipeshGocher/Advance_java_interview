package com.rays.transactionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TranactionHandling {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");
			conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			int i = st.executeUpdate("delete from emp where id = 4");

			System.out.println(i);
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			System.out.println("data successfully added");
		}
	}
}
