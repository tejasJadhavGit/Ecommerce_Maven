package java_Classes;
import java.util.Arrays;
import java.util.List;

public class arrayToarraylist {

	public static void main(String[] args) {
		
		
		String [] name= {"abc", "hello", "xyz","kyc"};
		
		
		for (int i=0; i<name.length; i++) {
			
			
		System.out.println(name[i]);
		
		//convert array into array list
		}
		
List al= Arrays.asList(name);
		
		System.out.println(al);
		al.add(2, "Hollo");
		System.out.println(al);
		
		
	}

}
