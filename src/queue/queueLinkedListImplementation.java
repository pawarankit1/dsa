package queue;

public class queueLinkedListImplementation {
		Node front, rear;
		int size;
		
		public queueLinkedListImplementation() 
		{
			front = rear = null;
			size = 0;
		}
		
		public void enqueue(int x) 
		{
			Node temp = new Node(x);
			size++;
			if(front == null) 
			{
				front = rear = temp;
				return;
			}
			rear.next = temp;
			rear = temp;
		}

		public void dequeue()
		{
			if(front == null)
				return;
			size--;
			
			front = front.next;
			
			if(front == null)
				rear = null;
		}
}
