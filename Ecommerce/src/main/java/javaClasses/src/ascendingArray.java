import java.util.Arrays;

import org.testng.annotations.Test;

public class ascendingArray {

//	@Test
//	
//	public void UsingSortMethod()
//	{
//		
//	int a []=  {10,8,12,15, -65, 2, 6};
//	
//     Arrays.sort(a);
//	
//	for (int i=0; i<a.length; i++)
//	{
//	
//		System.out.println(a[i]);
//	}
//     
//	}
	
@Test
	
	public void UsingLogic()
{
	
	int a []=  {10,8,12,15, -65, 2, 6};
	
	for (int i=0; i<a.length; i++)
		
	{
		
for (int j=i+1; j<a.length; j++)
{
	int temp=0;
	
	if(a[i] >a [j])
	{
	
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}	
	
}
System.out.println(a[i]);
	
	
	}
}

}