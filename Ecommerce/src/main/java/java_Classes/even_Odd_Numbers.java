package java_Classes;

public class even_Odd_Numbers {
	
	
	public static void main(String args[])
	{

	int a=12483;
	int	Even_count=0;
	int odd_count=0;
		
while(a>0)
{
	int num=a%10;
			
	if (num%2==0)
		
	{	
		Even_count++;
	}
	
	else
	{
			odd_count++;
		
	}
	
	a=a/10;
	
	}
System.out.println("Even number :"  + Even_count +  " odd Number :" + odd_count);
	}
}
