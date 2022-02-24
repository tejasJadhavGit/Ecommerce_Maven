import org.testng.annotations.Test;

public class porogession_Arithmatic {
	
	@Test
	public void missing_Number()
	{
//		Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).
//		Input Example:
//		N = 6
		
	int	a [] = {3, 6, 9, 15} ;
	
    int b= a[1]-a[0];
    int c=0;	
	for (int i=1; i<a.length; i++)
	{
		 
		
		
		if (a[i] - a[i-1] != b)
			
		{
			c= a[i-1] + b ;
		}
		
		
	}
	System.out.println(c);
	
		
	}
@Test
public void easyWay()
{
	 int	a [] = {3, 6, 9, 15} ;
	 int diff= a[1]- a[0];
	 
	 for (int i=1; i<a.length; i++)
	 {
		 
		 if(a[i]- a[i-1]!=diff)
		 {
			 System.out.println(a[i-1] + diff);
			 
			 
		 }
	 }
		
}
}
