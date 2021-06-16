package Collections;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		//Perform Binary Search
		int index = Arrays.binarySearch(numbers, 4);
		
		System.out.println("The index of element 4 in the array is " + index);
		
		// To Sort an Array
		Integer[] num = {12,67,21,10,9,56,33};
		Arrays.sort(num);
		for(int i: num) {
			System.out.println(i + " ");
		}
		

	}

}
