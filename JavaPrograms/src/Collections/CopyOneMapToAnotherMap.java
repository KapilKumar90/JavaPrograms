package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CopyOneMapToAnotherMap {

	public static void main(String[] args) {
		Map<String,Integer> map1= new HashMap<>();
		map1.put("Kapil",989178245);
		map1.put("Tanmay",65667778);
		map1.put("Vivek",263744575);
		map1.put("Sudeep",446457745);
		
		Map<String,Integer> map2= new HashMap<>();
		map2.put("Ravi",989178245);
		map2.put("Neeraj",65667778);
		map2.put("Sandeep",263744575);
		map2.put("Khitiz",446457745);
		
		map1.putAll(map2);
		System.out.println(map1);
		
	for(Map.Entry<String,Integer> m:map1.entrySet())
	{
		System.out.println(m.getKey()+"  "+ m.getValue());
		
	}
		
		

	}

}
