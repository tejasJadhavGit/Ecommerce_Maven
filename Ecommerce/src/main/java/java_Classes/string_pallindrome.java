package java_Classes;

public class string_pallindrome {

	public static void main(String[] args) {
		String name= "kekt";
	int ln=	name.length();
	String rev="";
	
	for(int i=ln-1; i>=0; i--)
		
	{
		rev=rev+name.charAt(i);
	}
	{System.out.println(name +" Is original String");}
	{System.out.println(rev +" Is Reversed Number");}
	
	if(name.equals(rev))
	{
		{System.out.println(name +" Hence Is Pallindrome");}
	}
	else
	{
		System.out.println(name +" Hence Is not a Pallindrome");
	}
	}

}
