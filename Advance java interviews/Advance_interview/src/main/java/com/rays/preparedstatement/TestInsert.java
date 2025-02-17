package com.rays.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/interview", "root", "root");

		PreparedStatement pstmt = conn.prepareStatement("insert into marksheet values(8,'samay', 19, 22, 34)");

		int i = pstmt.executeUpdate();

		System.out.println("data inserted => " + i);

	}
}

