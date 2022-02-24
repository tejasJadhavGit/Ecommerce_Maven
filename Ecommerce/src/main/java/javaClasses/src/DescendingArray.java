import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class DescendingArray {
	
	@Test
	
	public void UsingSortMethod()
	{
		
	
	Integer []a = { 10, 8, 12, 15, -65, 2, 6 };
	
	Arrays.sort(a, Collections.reverseOrder());   
	
	System.out.println(Arrays.toString(a));
	
	
	}	
}
