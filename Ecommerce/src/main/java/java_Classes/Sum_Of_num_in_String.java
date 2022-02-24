package java_Classes;

public class Sum_Of_num_in_String {

	
	
	public static void main(String[] args) {
		 String a= "as34m56h";
		 
		 int num=0;
		 int sum=0;
		 
		 for (int i=0; i<a.length(); i++)
			{
			
		 if(a.charAt(i)>='0' && a.charAt(i)<='9')	 
		 {
			 
		
			 num= num*10 + (a.charAt(i)-'0');
		 } 
			 else
			 {
				 
				sum+= num;
				num=0;
			 }
		 }
		 
		 System.out.println(sum + num);
	}

public void anotherWay()
{
	String a= "ab123fg23";
	
	int sum=0;
	
	for (int i=0; i<a.length(); i++)
	{
	
		
		
		if(Character.isDigit(a.charAt(i)))
		{		
			
		sum= sum + Character.getNumericValue(a.charAt(i));
		
		}
		
	}
	
	System.out.println(sum);
	
	}

}
