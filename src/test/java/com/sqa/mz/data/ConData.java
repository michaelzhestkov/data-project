/**
 *   File Name: ConData.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 23, 2016
 *
 */

package com.sqa.mz.data;

import java.sql.*;
import java.util.*;

public class ConData {

	public static Object[][] myData = { new Object[] { 1, "camera", 5 }, new Object[] { 2, "phone", 6 },
			new Object[] { 3, "toy", 3 } };

	public static Object[][] evalDatabaseTable(String driverClassString, String databaseStringUrl, String username,
			String password, String tableName) throws ClassNotFoundException, SQLException {

		Object[][] myData = ConData.myData;
		ArrayList<Object> myArrayData = new ArrayList<Object>();
		// Object[] item1 = { 1, "camera", 5 };
		// Object[] item2 = { 2, "phone", 6 };
		// Object[] item3 = { 1, "tv", 3 };
		//
		// myArrayData.add(item1);
		// myArrayData.add(item2);
		// myArrayData.add(item3);

		Class.forName(driverClassString);

		Connection dbconn = DriverManager.getConnection(databaseStringUrl, username, password);

		Statement stmt = dbconn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from " + tableName);

		int numOfColumns = rs.getMetaData().getColumnCount();

		while (rs.next()) {
			Object[] rowData = new Object[numOfColumns];

			for (int i = 0; i < rowData.length; i++) {
				rowData[i] = rs.getString(i + 1);
			}

			myArrayData.add(rowData);

			myData = new Object[myArrayData.size()][];

			for (int i = 0; i < myData.length; i++) {
				myData[i] = (Object[]) myArrayData.get(i);

			}

			// String id = rs.getString(1);
			// String name = rs.getString(2);
			// String quantity = rs.getString(3);
			// System.out.println("Id:" + id + " Name " + name + " Quantity " +
			// quantity);
		}

		// Step 5
		rs.close();
		stmt.close();
		dbconn.close();

		return myData;

	}

	public static Object[][] evalSpreadSheet() {
		return myData;

	}

	public static Object[][] evalTextFile() {
		return myData;

	}

}
