package Collections;

import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array1 = new ArrayList<>();
		ArrayList<String> array2 = new ArrayList<>();
		
		array1.add("item1");
		array1.add("item2");
		array1.add("item3");
		array1.add("item4");
		
		array2.add("item1");
		array2.add("item2");
		array2.add("item3");
		array2.add("item4");
		
		System.out.println("Array list 1 :" + array1);	
		System.out.println("Array list 2 :" + array2);
		
		if(array1.equals(array2)== true)
		{
			System.out.println(" Array List is Equal");
		}
		else
		{
			System.out.println("Array List is not equal");
		}
		
		array2.add("item5");
		
		if(array1.equals(array2)== true)
		{
			System.out.println(" Array List is Equal");
		}
		else
		{
			System.out.println("Array List is not equal");
		}

	}

}
