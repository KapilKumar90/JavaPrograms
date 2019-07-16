package Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetFromAnotherCollection {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("White");
		list.add("White");

		System.out.println(list);

		HashSet<String> set=new HashSet<String>(list);  
		set.add("Blue");  
		Iterator<String> i=set.iterator();  
		while(i.hasNext())  
		{  
			System.out.println(i.next());  
		}  	 



	}

}
