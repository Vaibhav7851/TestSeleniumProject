package Collections;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		// To add element on set
		set.add(45);
		set.add(87);
		set.add(23);
		set.add(99);
		
		System.out.println("Set : "+ set);
		
		//to remove element from set
		
		set.remove(23);
		System.out.println(set);
		
	// To check if the elements are present or not : It will return true or False
		System.out.println(set.contains(100));
		
		// To check if set is empty or not : It will return true or False
		System.out.println(set.isEmpty());
		
		//To know the size of the set
		System.out.println(set.size());
		 // To clear set
		
		set.clear();
		System.out.println(set);

	}

}
