import java.util.ArrayList;
import java.util.Iterator;

public class array_List {

	public static void main(String[] args) {
		
	
		
		ArrayList <String> a= new ArrayList <String>() ;
		a.add("Hello");
		a.add(0, "at 2nd Number");
		a.add("Better");
		a.add("In the end");
		a.add("It doesnt");
		a.add("Even Matter");
		System.out.println(a);
		System.out.println(a.indexOf("In the end"));
		System.out.println (a.get(2)) ;
		
		Iterator<String> box=a.iterator();
	
		while(box.hasNext())
	{
		System.out.println(box.next());
	}
	
		
		
		
		
		
	}

}
