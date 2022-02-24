package java_Classes;
import java.util.Scanner;

public class pallindrome_reverse_Number {

	public static void main(String[] args) {
		
		int n=12213;
		int temp=n;
		int rev=0;
	while(n>0)
	{
		
		rev=(rev*10) + n%10;
		n=n/10;
	}
	
	{System.out.println(temp +" Is original Number");}
	{System.out.println(rev +" Is Reveresed Number");}
	
		if(rev==temp) 
		{System.out.println(temp +"  Is Pallindrome");}
		else
		{System.out.println(temp +"   Is not a Pallindrome");}
	}


	
/*	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number  :");
		int a=sc.nextInt();
//		int	rev=0;
//		while(a>0)
//			{	
//			rev= rev*10 + a%10; //0+4=4 
//			a=a/10;
//			
//		}
		
//		StringBuffer sb= new StringBuffer(String.valueOf(a));
//		StringBuffer rev=	sb.reverse();
//		
//		System.out.println(rev);
//		
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(a);
//		StringBuilder	rev=sbl.reverse();
//		System.out.println(rev);
	*/
	
}
