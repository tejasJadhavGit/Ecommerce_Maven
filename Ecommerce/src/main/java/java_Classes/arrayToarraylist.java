package java_Classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToarraylist {

	public static void main(String[] args) {
		
		
		String [] name= {"abc", "hello", "xyz","kyc"};

		// for (String s : name) System.out.println(s);

		for (int i=0; i<name.length; i++) {
			
		System.out.println(name[i]);
		
		}

//		List al= Arrays.asList(name);
//
//		System.out.println("list of " + al);
//		al.add("Hollo");
//		al.add("Hi");
//		System.out.println(al);
//		System.out.println("Printed list of " + al);

		//When we convert array into array list does not let us add more elements to the converted list,
		// therefore, in such cases we create a new ArrayList and pass the converted list to the constructor
		// of the new ArrayList using new ArrayList<>(Arrays.asList()).

		List<String> str=new ArrayList<>(Arrays.asList(name));

		str.add("Hollo");
		str.add("Hi");
		System.out.println(str);


	}

}
