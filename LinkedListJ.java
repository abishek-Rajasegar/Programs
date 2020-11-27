package project;

public class LinkedListJ {

	createnode head;
	


	public class createnode
	{
		int data;
		createnode next;
		
		createnode(int data)
		{
			this.data=data;
			next=null;
		}
	}

	public void insert(int data) {
		createnode newnode = new createnode(data);
		

		if (head == null) {
			head = newnode;
		} 
		else 
		{
			createnode temp = head;
			
			while (temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void insertStart(int data) {
	
		createnode newnode = new createnode(data);
        
		newnode.next = head; 
		head= newnode;
	
	}

	public void insertMiddle(int position , int data)
	{
	     
		createnode newnode = new createnode(data);
		
		createnode temp = head;
		
		for(int i=0;i<position-1;i++)
		{
			temp= temp.next;
		}
		
		newnode.next= temp.next;
		temp.next=newnode;
		
	
		
	}
	
	public void deletAtTheStart()
	{
		head=head.next;
	}
	
	public void deletAtTheEnd()
	{
		createnode temp = head;
		createnode prev = null;
		while(temp.next!=null)
		{
		      prev = temp;
		      temp = temp.next;
		      
		}
		prev.next=null;
	}
	
	public void deletAtanyPosition(int position)
	{
		createnode node = head;
		
		
		for(int i=0;i!=position-2;i++)
		{
			
			node = node.next;
		}
		
		node.next = node.next.next; 
		
		
		
	}
	
	
	public void display() {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		
		
		LinkedListJ pointer = new LinkedListJ();
		pointer.insert(10);
		pointer.insert(20);
		pointer.insert(30);
		pointer.insert(40);
		pointer.insert(50);
		pointer.insert(60);
		
//		pointer.insertStart(5);
//		pointer.insertStart(9);
//		
//		pointer.insertMiddle(4, 7);
//		
//		pointer.deletAtTheStart();
//
//		pointer.deletAtTheEnd();
//		pointer.deletAtTheEnd();
		
		pointer.deletAtanyPosition(3);
		pointer.display();

	}

}
