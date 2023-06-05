package java_Classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class practice {

	public static void main(String args[])
	{

//		reverse_Number();
//	reverseString();
		reverse_sentence();
	}


	private static void reverseString()
		{
//1:2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
//			String str = "AHCECLWLXO";
//			StringBuilder sb = new StringBuilder();
//
//			for (int i = 1; i < str.length(); i += 2) {
//				sb.append(sb.charAt(i));
//			}
//
//			String hello = sb.toString();
//			System.out.println(hello);

			String name = "ahceclwlxo";
			StringBuilder sbNew = new StringBuilder();
			int len=name.length();
			String rev="";
			for (int i = 1; i < name.length(); i += 2) {
				//System.out.println(sbNew.append(i));

				 rev = rev + (name.charAt(i));

			}
			System.out.println(rev.toUpperCase());
}


@Test
	public static void reverse_sentence() {
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

	public static void reverse_Number()
	{
		int n= 12345;
		int rev= 0;

		while(n>0)
		{
			rev=(rev *10) + n%10;
			n=n/10;

		}
		System.out.println(rev);

	}

	private static void extracted(Scanner sc) {
		String num= sc.nextLine();
		System.out.println(num);
	}


}
	



