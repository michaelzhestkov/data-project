package com.sqa.mz.helper;

import java.sql.*;

import org.testng.annotations.*;

import com.sqa.mz.data.*;

public class ConDataTest {
	@DataProvider
	public Object[][] dpMySQL() throws ClassNotFoundException, SQLException {
		return ConData.evalDatabaseTable("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:8889/sqadb", "root", "root",
				"amazon");
	}

	@DataProvider
	public Object[][] dpPostgres() throws ClassNotFoundException, SQLException {
		return ConData.evalDatabaseTable("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/autodb", "postgres",
				"root", "monster");
	}

	@Test(dataProvider = "dpPostgres", priority = 2)
	public void testAmazon(Object id, Object keywords, Object results) {
		System.out.println("Test dB with Postgres " + keywords);
	};

	@Test(dataProvider = "dpMySQL", priority = 1)
	public void testMonster(Object id, Object name, Object quantity) {
		System.out.println("Test dB with MySQL " + name);
	};
}
