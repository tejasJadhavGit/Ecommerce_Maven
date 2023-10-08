package java_Classes;

public class even_Odd_Numbers_Array {
	
	public static void main(String args[])
	{

		int a[]= {12, 34, 23, 90, 44, 11, 13};	
		
		System.out.println("Even Number ");
		for (int i=0; i<a.length; i++)
		{
			
			if (a[i]%2!=0)

				System.out.println(a[i] + " odd number " );

			else
				System.out.println(a[i] + " even number " );
		}	


	}

}
