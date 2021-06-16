package Collections;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		
		//To add key and Value
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		
		
		System.out.println(map);
		
		//To override the Key 
		map.put("Two", 23);
		
		
		// if condition to check if key is present 
		map.putIfAbsent("Two", 43);
		
		// To check  if the map contains the value
		System.out.println(map.containsValue(66));
		
		//Iterate inside a Map
		for (Map.Entry<String, Integer> e  : map.entrySet()) {
			System.out.println(e);
			
			//to print key
			System.out.println(e.getKey());
			//to print value
			System.out.println(e.getValue());
		}
		// new
		//To print the Key value only through Iterator
		for (String key : map.keySet()) {
			
			System.out.println(key);
		}
		
		//To print the Values only through Iterator
		for (Integer value : map.values()) {
			System.out.println(value);
			
		}
		
		// To check whether the map is empty 
		System.out.println(map.isEmpty());
	}

}
