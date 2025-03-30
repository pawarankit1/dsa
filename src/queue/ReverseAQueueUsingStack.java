package queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseAQueueUsingStack {
	
	/*
	 * public static Object reverse(Queue<Integer> q) { Stack<Integer> s = new
	 * Stack<Integer>(); while(q.isEmpty() == false) { s.push(q.remove()); }
	 * while(s.empty() == false) { q.add(s.pop()); } return q; }
	 */
	public static void reverse(Queue<Integer> q) 
	{
		if(q.isEmpty())
			return;
		
		int x = q.remove();
		reverse(q);
		q.add(x);
		
	}

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		reverse(q);
		System.out.print("Reversed Queue: ");
		while(!q.isEmpty()) {
			System.out.print(q.remove() + " ");
		}

	}

}
