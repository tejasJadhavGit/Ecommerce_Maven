
public class separate_upperLowerinString {

	public static void main(String[] args) {
		
//		 Scanner s= new Scanner(System.in);
//		 
//		 String str= "";
//		 
//		 System.out.println("Enter your string");
//		 
//		 str=s.nextLine();
//		 
//		 System.out.println(str);
		 
		
		
	 String str= "L&T Techonlogies services";
	 
	 
	 String up_class= "";
	 String spechar="";
	 String smallchar="";
	 
	 System.out.println("Lower case letters");
	 for (int i=0; i<str.length(); i++)
	 {
		 
		 if (Character.isLowerCase(str.charAt(i))) 
		 {
			 
			 smallchar= smallchar + str.charAt(i) + " ";
		 }
		 
		 }
	 System.out.println(smallchar);
	 System.out.println("Upper case letters");
	 
	 for (int i=0; i<str.length(); i++)
	 {
		 
		 if (Character.isUpperCase(str.charAt(i))) 
		 {
			 
			 up_class= up_class + str.charAt(i) + " ";
		 }
		 
		 
		 }
	 System.out.println(up_class);
	 

	}

}
