package org.testing.Assertion;





public class Assert{ 
	
	public static void Assert_Url(String expected,String actual)

	{
		if (expected.equals(actual))
		{
			System.out.println("Actual and Expected Url are same ie Url Assertion is pass");
		}
		
		else
		{
			System.out.println("Actual and expected Url are different ie Url Assertion is Fail ");
		}
	}
	public static void Assert_email(String expected,String actual)
	{
		if (expected.equals(actual))
		{
			System.out.println("Actual and Expected Email are same ie Email Assertion is pass");
		}
		
		else
		{
			System.out.println("Actual and expected Email are different ie Email Assertion is Fail ");
		
		}
	}
}


