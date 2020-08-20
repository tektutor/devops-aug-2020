package org.tektutor;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Properties;
import java.util.Enumeration;
import java.io.InputStream;

public class MathFactory {
	private static	Map<String, String> classNameMap;

	static {
           try{
		classNameMap = new HashMap<String,String>();

		InputStream fileReader 
			= MathFactory.class
				.getClassLoader()
				.getResourceAsStream("rpn.properties");

		Properties properties = new Properties();
		properties.load ( fileReader );
		
		Set<Object> set = properties.keySet();
		String key, value;
		Enumeration entry = properties.propertyNames();
	
		while ( entry.hasMoreElements() ) {

			key   = (String) entry.nextElement();
			value = (String) properties.getProperty( key );

			classNameMap.put ( key, value );		 
		}
           }
           catch ( Exception e ) {
		e.printStackTrace();
	   }
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
