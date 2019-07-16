package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRemoveElement {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Set <String> s= new HashSet<>();
		  s.add("Red");
		  s.add("Yellow");
		  s.add("Green");
		  s.add("White");
		  s.add("White");
		  System.out.println("Primary set is:"+s);
		  //Remove elements from set
		  s.remove("White");
		  s.remove("Red");
		  System.out.println("Updated  set is:"+s);
	
		  Set <String> s1= new HashSet<>();
		  s1.add("Red");
		  s1.add("White");
		  
		  //Adding all elements from  one set  to another set
		  s.addAll(s1);
		  System.out.println("Updated  set s  is:"+s);
		  // Removing added HashSet elements
		  s.removeAll(s1);
		  System.out.println("After removing   HashSet s is:"+s);
		  
		  //Removing selected items from HashSet
		  s.removeIf(str->s.contains("Yellow"));
		  System.out.println("After removing  selected element from HashSet s is:"+s);
		  // Find item exists or not in HashMap
		  if(s.contains("Green"))
		  System.out.println("This item  exist in the HashMap");
		  else
			  System.out.println("This item does not   exist in the HashMap");
		  
		  
		

	}

}
