package project;

public class stackLinkedList {

	stackNode head;
	
	public class stackNode
	
	{
		int data;
		stackNode next;
			
		stackNode(int data)
		{
			this.data = data;
			next= null;
		}
	}
	
	public void push(int data)
	{
		stackNode newnode =new stackNode(data);
		if(head==null)
		{
			head=newnode;
		}
		else 
		{
			newnode.next= head;
			head=newnode;
		}
		
	}
	
	
	public void pop()
	{
		head=head.next;
	}
	
	public void display()
	{
		stackNode temp =head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			
			temp = temp.next;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		stackLinkedList pointer = new stackLinkedList();
		
		pointer.push(10);

		pointer.push(20);

		pointer.push(30);

		pointer.push(40);

		pointer.push(50);
		
		pointer.pop();

		pointer.pop();
		
		pointer.display();
		
	}
}
