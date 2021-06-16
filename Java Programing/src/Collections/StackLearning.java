package Collections;

import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// It work on LIFO (Last In First Out)
		Stack<String> animals = new Stack<String>();
		
		// To add object to stack we use push
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Cow");
		animals.push("Cat");
		
		System.out.println("Stack :" +animals);
		
		// How to check the First object to come out in stack
		
		System.out.println(animals.peek());
		
		// To remove first object from stack
		animals.pop();
		
		System.out.println("Stack : " +animals);
		

	}
	

}
