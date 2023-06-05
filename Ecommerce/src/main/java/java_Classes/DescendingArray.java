package java_Classes;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class DescendingArray {
	
	@Test
	public static void ascendingDescending() {
		int a[]= {10, 12, -9, 29, 35, -23};
		Integer c[]= {10, 12, -9, 29, 35, -23};
		Arrays.sort(a);

		String b = " ";
		for (int i=0; i<a.length; i++ )
		{

			b= b + " " + a[i] ;

		}
		System.out.println( " Ascending numbers = " + b);

		Arrays.sort(c, Collections.reverseOrder());
		System.out.println( " Descending numbers = " + Arrays.toString(c));
	}


	@Test
	public void UsingSortMethod()
	{
		
	
	Integer []a = { 10, 8, 12, 15, -65, 2, 6 };
	
	Arrays.sort(a, Collections.reverseOrder());   
	
	System.out.println(Arrays.toString(a));
	
	
	}	
}
