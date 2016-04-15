package com.sqa.aa.util.helpers.math;

import static org.testng.Assert.*;

import org.testng.annotations.*;

import com.sqa.aa.util.helpers.*;

/**
 *   File Name: MyMathTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

/**
 * MyMathTest //ADDD (description of class)
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

public class MyMathTest {
	@DataProvider(name = "Power Data")
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 1.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 4.00 }

		};
		return data;
	}

	@Test(enabled = false)

	public void testHasCleanDivision() {
		double num1 = 4;
		double num2 = 2;
		boolean result = MyMath.hasCleanDivision(num1, num2);
		System.out.println(String.format("Does %.0f divided by %.0f have clean division: %b", num1, num2, result));
	}

	@Test(enabled = false)

	public void testMyMathClassAdd() {
		double result;
		// double number = 0;
		double addNumber = 9;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		result = myMath.getTotal();
		System.out.println(String.format("The result of 0 and adding " + "%.0f is %.0f", addNumber, result));

	}

	@Test(enabled = false)

	public void testMyMathClassDiv() {
		double result;
		double addNumber = 10;
		double divNumber = 2;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.div(divNumber);
		result = myMath.getTotal();
		System.out
				.println(String.format("The result of 0 and adding " + "%.0f and than" + " dividing " + "%.0f is %.0f",
						addNumber, divNumber, result));

	}

	@Test(enabled = false)

	public void testMyMathClassMult() {
		double result;
		double addNumber = 10;
		double multNumber = 4;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.mult(multNumber);
		result = myMath.getTotal();
		System.out.println(
				String.format("The result of 0 and adding " + "%.0f and than" + " multiplying " + "%.0f is %.0f",
						addNumber, multNumber, result));

	}

	@Test(enabled = false)

	public void testMyMathClassResetNumbers() {
		double result;
		double addNumber = 10;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.reset();
		result = myMath.getTotal();
		System.out.println(
				String.format("The result of 0 and adding " + "%.0f and than resetting is %.0f", addNumber, result));

	}

	@Test(enabled = false)

	public void testMyMathClassSub() {
		double result;
		double addNumber = 10;
		double subNumber = 3;
		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.sub(subNumber);
		result = myMath.getTotal();
		System.out.println(
				String.format("The result of 0 and adding " + "%.0f and than" + " subtracting " + "%.0f is %.0f",
						addNumber, subNumber, result));

	}

	@Test(dataProvider = "Power Data")
	public void testPowerNumbers(double num, double power, double expectedResult) {
		double actualResult;

		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("The result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		// TestNg Params: Actual, Expected, delta, Message
		assertEquals(actualResult, expectedResult, 0, message);
	}

	// @Test
	// @Ignore
	// public void testPowerNumbers() {
	// double result;
	// double num = 5;
	// double power = 4;
	// result = MyMath.powerNumber(num, power);
	// System.out.println(String.format("The result of %.0f to the power of %.0f
	// is %.0f", num, power, result));
	// }

}
