package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FIFO
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(13);
		queue.offer(17);
		queue.offer(70);
		queue.offer(60);
		
		System.out.println("Queue :" + queue);
		
		// To remove the first object from queue
		System.out.println(queue.poll());
		
		// how to know next element in the queue which will come out 
		System.out.println(queue.peek());

	}

}
