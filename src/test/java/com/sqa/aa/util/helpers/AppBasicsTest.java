/**
 *   File Name: AppBasicsTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 2, 2016
 *
 */

package com.sqa.aa.util.helpers;

import org.testng.annotations.*;

/**
 * AppBasicsTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasicsTest {
	static String appName = "Anna Test";
	static String userName;

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helpers.AppBasics#farewellUser(java.lang.String, java.lang.String)}
	 * .
	 */
	@Test
	public void testFarewellUser() {
		AppBasics.farewellUser(userName, appName);

	}

	/**
	 * Test method for
	 * {@link com.sqa.aa.util.helpers.AppBasics#welcomeUserAndGetUserName(java.lang.String)}
	 * .
	 */
	@Test
	public void testWelcomeUser() {
		userName = AppBasics.welcomeUserAndGetUserName(appName);

	}

}
