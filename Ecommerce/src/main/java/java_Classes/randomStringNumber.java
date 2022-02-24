package java_Classes;
import java.util.Random;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class randomStringNumber {

	// We use Apache commons long API

	public static void main(String args[])
	{
		
		String a=RandomStringUtils.randomNumeric(10);
		System.out.println(a);
		
//		int i=Integer.parseInt(a);  
//	System.out.println(i);
	
	
	String b=	RandomStringUtils.randomAlphabetic(3);
	System.out.println(b);
	
	String c=	RandomStringUtils.randomAlphanumeric(12);
	System.out.println(c);
	}
}
