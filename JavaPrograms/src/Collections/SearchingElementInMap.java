package Collections;

import java.util.HashMap;
import java.util.Map;

public class SearchingElementInMap {

	public static void main(String[] args) {
		Map<String,Integer> map1= new HashMap<>();
		map1.put("Kapil",989178245);
		map1.put("Tanmay",65667778);
		map1.put("Vivek",263744575);
		map1.put("Sudeep",446457745);
		
		Map<String,Integer> map2= new HashMap<>();
		map2.put("Kapil",989178245);
		map2.put("Tanmay",65667778);
		map2.put("Sandeep",263744575);
		map2.put("Khitiz",446457745);
		
		for (String name : map1.keySet()){
	        if(map2.containsKey(name) && map1.get(name).equals(map2.get(name))){
	            System.out.println(name);	        }
	    }
		
		/*
		for (Map.Entry<String,Integer> name : map1.entrySet()){
	        if(map2.containsKey(name) &&  map1.get(name).equals( map2.get(name))){
	            System.out.println(name.getKey()+ "    "+name.getValue());	        }
	    }
	    */
	}
}
