
public class prime_Number {

public void number_Prime()	{
	int a=11;
	String temp=" ";
	
	for(int i=2; i<=a-1; i++)
	{
		if(a%i==0)
		{
			temp= temp + "Not a Prime Number";
		}
		
	}
if(temp.contains("Not"))
{
System.out.println(a + " is not a Prime Number");
}
else
{
System.out.println(a + " is a Prime Number");
}
}
	public static void main(String[] args) {
		
		int n=100;
	int	temp=0;
		for (int i=2; i<=n-1; i++ )
		{
			if(n%i==0) 
			{
				temp=temp+1;
			}
		}
		
		if(temp>0) {
			
			System.out.println(n + "  Is not a prime Number");
		}
		
		else
		{
			System.out.println(n +  "Is a prime Number");
		}
	}
	

}
