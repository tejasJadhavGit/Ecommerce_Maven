package java_Classes;

public class even_Odd_Numbers_Array {
	
	public static void main(String args[])
	{

		int a[]= {12, 34, 23, 90, 44, 11, 13};	
		
		System.out.println("Even Number ");
		for (int value:a)
		{
			
			if ((value%2==0))
			{
				System.out.println(value);
			}
		}	

		System.out.println("Odd Number ");
		for (int value:a) {
		
			
			if (!(value%2==0))
			{
				System.out.println( value);
			}
		}
	}

}
