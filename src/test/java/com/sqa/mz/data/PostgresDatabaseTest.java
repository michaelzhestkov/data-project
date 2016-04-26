package com.sqa.mz.data;

import java.sql.*;

import org.testng.annotations.*;

public class PostgresDatabaseTest {

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		// Step 1
		Class.forName("org.postgresql.Driver");
		// Step 2
		Connection dbconn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sqadb", "postgres", "root");
		// Step 3
		Statement stmt = dbconn.createStatement();
		// Step 4
		ResultSet rs = stmt.executeQuery("select * from person");

		while (rs.next()) {
			String is = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			String city = rs.getString("city");
			String zip = rs.getString("zip");
			System.out.println("Name:" + name + " City " + city + " Address " + address);
		}

		// Step 5
		rs.close();
		stmt.close();
		dbconn.close();

	}

}
