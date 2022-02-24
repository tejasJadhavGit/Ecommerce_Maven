package java_Classes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class numberOfcharacterInString 
{ 
	public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  String str1 = "Enter your String";
		  System.out.println("Enter your String:");
		  str1=cs.nextLine();
		  char[] str=str1.toCharArray();
		  int i;
		  int arr[]=new int[256];
		     for(i=0;i<str.length;i++)
		     {
		         if(str[i]==' ')
		             continue;
		             arr[str[i]]++;
		     }
		     System.out.println("Repeated character in a string are:");
		     for(i=0;i<256;i++)
		     {
		         if(arr[i]>1)
		         {
		          System.out.println((char)(i)+" occurs "+arr[i]+" times");
		         }}
		     cs.close();
	
	}
	}
	 	 
	     
