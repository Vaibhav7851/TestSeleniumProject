package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(80);
		list.add(39);
		list.add(12);
		list.add(9);
		list.add(9);
		
	//To verify the minimum  element on the list
		System.out.println("Minimum Element : " + Collections.min(list));
		//To Verify the maximum element of the list 
		System.out.println("Maximum Element : "+ Collections.max(list));
		
		//CHeck the frequency of the element
		System.out.println(Collections.frequency(list, 9));
		
		//sorting in Ascending order
		Collections.sort(list);
		System.out.println(list);
		
		//Sorting in Descending Order
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
	}

}
