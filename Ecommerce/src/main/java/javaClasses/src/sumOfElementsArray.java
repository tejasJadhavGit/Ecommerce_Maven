import org.testng.annotations.Test;

public class sumOfElementsArray {
	
	
	public static void main(String args[])
	{
		
		
		int a[]= {12, 34, 23, 90};	
		
	int	sum=0;
	
	for (int i=0; i<=a.length-1; i++)
	{
		
		sum= sum + a[i];
		
	}
		System.out.println(sum);
	}
// using enhanced for loop
	
	@Test
	public void sumofarray()
	{
		int a[]= {12, 34, 23, 90};	
		
		int	sum=0;
		
		for(int value:a)
		{
			
			sum= sum + value ;
		}
		
		System.out.println(sum);
		
	}
}
