package java_Classes;
import org.testng.annotations.Test;

public class factorial_num {
	
	
	
	public static  void main(String args[])
	{
		
		int num=5;
		long fac=1;
		
		for(int i=1; i<=num; i++)
		{
			
			fac=fac * i ;
			
			
		}
		
		System.out.println(fac);
		
	}

}
