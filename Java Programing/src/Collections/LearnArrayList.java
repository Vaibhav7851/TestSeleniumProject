package Collections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(80);
		list.add(39);
		
		System.out.println(list);
		
		//To Add new element 
		list.add(70);
		System.out.println(list);
		
		// To add new element in 2nd position
		list.add(2, 90);
		System.out.println(list);
		
		// update any element 
		list.set(1, 99);
		System.out.println(list);
		
		// To add new List to the existing list
		List<Integer> newList = new ArrayList();
		newList.add(100);
		newList.add(120);
		
		list.addAll(newList);
		System.out.println(list);
		
		// to get the element from index
		
		System.out.println(list.get(5));
		
		//to check if the element present in the list : It will return true or false
		
		System.out.println(list.contains(77));
		
		//remove an element from the array by index
		
		list.remove(0);
		System.out.println(list);
		
		//remove an element by its value
		
		list.remove(Integer.valueOf(70));
		System.out.println(list);
		
		//remove all the element from the list 
		list.clear();
		System.out.println(list);
	}

}
