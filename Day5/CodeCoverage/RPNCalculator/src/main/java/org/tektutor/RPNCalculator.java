package org.tektutor;

import java.util.Stack;

public class RPNCalculator {

	private double firstNumber, secondNumber, result;
	private Stack<Double> numberStack;

	public RPNCalculator() {
		firstNumber = secondNumber = result = 0.0;
		numberStack = new Stack<Double>();
	}

	private void extractInputs() {
		secondNumber = numberStack.pop();			
		firstNumber = numberStack.pop();			
	}

	private boolean isMathOperator ( String token ) {
		String mathOperators = "+-*/";
		
		return mathOperators.contains( token );
	}

	public double evaluate ( String strRPNMathExpression ) {

		String rpnTokens[] = strRPNMathExpression.split ( " " );
		IMathOperator mathOperator = null;
		
		for ( String token : rpnTokens ) {

			if ( isMathOperator ( token ) ) {

				extractInputs();
				mathOperator = MathFactory.getObject ( token );
			
				result  = mathOperator.evaluate ( firstNumber, secondNumber );
				numberStack.push ( result );

			}
			else {
				numberStack.push ( Double.parseDouble ( token ) );
			}

		}

		return numberStack.pop();
	}

}
