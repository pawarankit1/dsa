package queue;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
	public void fun(Node root) {
		if(root == null) return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(q.isEmpty() == false) {
			Node curr = q.poll();
			System.out.println(curr.data + " ");
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
