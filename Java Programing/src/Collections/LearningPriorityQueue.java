package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearningPriorityQueue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Min heap 
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(30);
		pq.offer(80);
		pq.offer(40);
		pq.offer(12);
		
		System.out.println("Priority Queue Min Value :" + pq);
		
		// to remove the object whose priority is more i.e. 12 in above case
		
		pq.poll();
		System.out.println(pq);
		
		//to check the first element in the priority queue
		System.out.println(pq.peek());

		// Max heap
		PriorityQueue<Integer> pqMax = new PriorityQueue<>(Comparator.reverseOrder());
		
		pqMax.offer(70);
		pqMax.offer(40);
		pqMax.offer(90);
		pqMax.offer(10);
		
		System.out.println("Priority Queue Max Value :" +pqMax);
	}

}
