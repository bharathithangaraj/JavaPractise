package Collections;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueExp {

	
	public static void main(String[] args) {
		
		Queue<String> queue =  new PriorityQueue<String>();
		
		queue.add("first");
		//queue.add(null);  null not allow throw exception
		queue.offer("second"); 
		queue.offer("third"); 
		
		queue.remove(); //used to remove the head of the queue,if its empty throw nullpointer exception
		queue.poll(); //used to remove the head of the queue, if its empty return null
		
		queue.element(); //retrive the head of the element if its empty throw nullpointer exception
		
		queue.peek(); //retrive the head of the element if its empty return null
		
		
		System.out.println(queue);

	}

}
