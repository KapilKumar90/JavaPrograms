package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {

  Set <String> s= new HashSet<>();
  s.add("Red");
  s.add("Yellow");
  s.add("Green");
  s.add("White");
  s.add("White");
  
  Iterator <String> itr= s.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
  }
  
  

	}

}
