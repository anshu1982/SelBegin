
package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	public static void takeLog(String classname,String message)
	{
		// Firstly connect your Utility file with method defined for taking logs 
		DOMConfigurator.configure("../YTFUtilities/Layout.xml");
		//We will take dynamic classname, logs can be taken for any class. Its not for any particular class only
		Logger l = Logger.getLogger(classname);
		l.info(message);
		
		
	}


		
	}


