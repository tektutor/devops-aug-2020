package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class RPNCalculatorTest {


	@Test
	public void testSimpleAddition() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult  = rpnCalculator.evaluate ( "10 15 +" );		
		double expectedResult = 25.0;
		assertEquals ( expectedResult, actualResult, 0.001 );

		actualResult  = rpnCalculator.evaluate ( "10 115 +" );		
		expectedResult = 125.0;
		assertEquals ( expectedResult, actualResult, 0.001 );
		
	}

	@Test
	public void testSimpleSubtraction() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult  = rpnCalculator.evaluate ( "100 15 -" );		
		double expectedResult = 85.0;
		assertEquals ( expectedResult, actualResult, 0.001 );

		actualResult  = rpnCalculator.evaluate ( "115 15 -" );		
		expectedResult = 100.0;
		assertEquals ( expectedResult, actualResult, 0.001 );
	}

	@Test
	public void testSimpleMultiplication() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult  = rpnCalculator.evaluate ( "100.12345 15 *" );	
		double expectedResult = 1501.85175;
		assertEquals ( expectedResult, actualResult, 0.001 );

		actualResult  = rpnCalculator.evaluate ( "100 5 *" );		
		expectedResult = 500.0;
		assertEquals ( expectedResult, actualResult, 0.001 );
	}

	@Test
	public void testSimpleDivision() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult  = rpnCalculator.evaluate ( "100 10 /" );	
		double expectedResult = 10;
		assertEquals ( expectedResult, actualResult, 0.001 );

		actualResult  = rpnCalculator.evaluate ( "100 5 /" );		
		expectedResult = 20.0;
		assertEquals ( expectedResult, actualResult, 0.001 );
	}

	@Test
	public void testComplexRPNMathExpression() {

		RPNCalculator rpnCalculator = new RPNCalculator();

		double actualResult  = rpnCalculator.evaluate ( "100 5 * 1000 20 / -" );	
		double expectedResult = 450;
		assertEquals ( expectedResult, actualResult, 0.001 );
	}
		
		
		
		

}
