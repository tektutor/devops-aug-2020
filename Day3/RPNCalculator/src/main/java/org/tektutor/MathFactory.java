package org.tektutor;

import java.util.HashMap;

public class MathFactory {
	private static	HashMap<String, String> classNameMap;

	static {
		classNameMap = new HashMap<String,String>();

		classNameMap.put ( "+", "org.tektutor.Addition" );
		classNameMap.put ( "-", "org.tektutor.Subtraction" );
		classNameMap.put ( "*", "org.tektutor.Multiplication" );
		classNameMap.put ( "/", "org.tektutor.Division" );
	}

	public static IMathOperator getObject ( String operator ) {

		IMathOperator mathOperator = null;

		String className = classNameMap.get ( operator );

		try {
			mathOperator = (IMathOperator) Class.forName ( className ).newInstance();
		}
		catch (Exception e ) {
			e.printStackTrace();
		}

		return mathOperator;
		
	}

}
