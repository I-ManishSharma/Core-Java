package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueHomo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(20);
		pq.add(15);
		pq.add(36);
		pq.add(05);
		pq.add(56);
		pq.add(36);
		pq.add(85);
		
		System.out.println(pq);
	}
}
