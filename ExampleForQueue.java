import java.util.*;
public class ExampleForQueue {
	public static void main(String[] args) {
		//Queue s=new PriorityQueue();
		PriorityQueue<Integer> pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		System.out.println("........................");
		for(Object i:pq) {
			System.out.println(pq);
		}
		System.out.println("........................");
		
		System.out.println(pq.poll());
	}

}
