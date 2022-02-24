package java_Classes;

public class reverse_String {

	 public  static void reverse_number(){
	        int n=1234;
	        int tem=n;
	        int rev=0, rem;
	        while (n>0){

	            rem=n%10;
	            rev=(rev*10)+rem;
	            n=n/10;
	        }

	        System.out.println("Original value : " + tem);
	        System.out.println("Reversed value : " +rev );

	    }
	    public static void rever_String() {

	        String name = "tejas";
	        int len=name.length();
	       String rev="";
	        for(int i=len-1; i>=0; i-- )
	        { rev=rev+name.charAt(i); }
	        System.out.println( "Original string =  "  + name );
	        System.out.println( "Reverse string =  "  + rev );

	    }

	    public static void reverse_sentence()
	    {
	String str=" My Name Is Tejas ";
	String a[]= str.split(" ");
	String rev =" ";
	for (int i=a.length-1; i>=0; i--)
	{
	    rev= rev + a[i] + " ";
	}
	        System.out.print( "Reverse string =  "  + rev);
	    }
	    
	    
	    public static void reverse_Each_Word() {
	        String str = " My Name Is Tejas ";
	        String a[] = str.split(" ");
	        String rev = " ";
	        for(String words:a )
	        {
	           String reversreWord="";
	           for(int i=words.length()-1; i>=0; i--)
	           {
	               reversreWord= reversreWord+ words.charAt(i);
	           }

	           rev= rev+ reversreWord+ " ";
	        }
	        System.out.print( "Reverse string =  "  + rev);





	    }
	public static void main(String[] args) {
		 reverse_String opt= new reverse_String();
		 opt.rever_String();
//       opt.reverse_number();
       opt.reverse_sentence();
       opt.reverse_Each_Word();
	}

}
