package project;

public class queueLinkedList {
	

	static Node front;
	static Node rear;
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public queueLinkedList() {
		
		queueLinkedList.front = queueLinkedList.rear = null;
	}
	
	public void enqueue(int data)
	{
		Node newNode = new Node(data);
		
		if(queueLinkedList.rear == null)
		{
			queueLinkedList.rear =  newNode;
			queueLinkedList.front = newNode;
		}
		
		
		queueLinkedList.rear.next = newNode;
		queueLinkedList.rear = newNode;
		
	}
	
	public void dequeue()
	{
		if(queueLinkedList.rear==null)
		{
			System.out.println("No element in the list");
		}
		
		queueLinkedList.front = queueLinkedList.front.next;
		
	}
	
	public void display()
	{
		while(queueLinkedList.front != null && queueLinkedList.rear != null )
		{
			
			System.out.println(front.data);
			queueLinkedList.front = queueLinkedList.front.next;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		queueLinkedList  pointer = new queueLinkedList();
		
		pointer.enqueue(10);

		pointer.enqueue(20);

		pointer.enqueue(30);

		pointer.enqueue(40);

		pointer.enqueue(50);

		pointer.enqueue(60);
		
		//pointer.display();

		
		
		pointer.dequeue();
        
        pointer.dequeue();
        
        pointer.dequeue();
	
		pointer.display();

		
		

		
		
	}

}
