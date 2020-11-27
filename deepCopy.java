package project;

public class deepCopy {

	public static class Node {
		int data;
		Node next;
		Node random;

		public Node(int data) {
			this.data = data;
			next = random = null;
		}
	}

	static Node head = null;

	public static void insertNode(Node temp,int data) {
		Node newNode = new Node(data);

		if (temp == null) {
			temp = newNode;
		} else {
			Node temp1 = head;

			while (temp1.next != null) {
				temp1 = temp1.next;
			}
			temp1.next = newNode;
		}
	}

	public void display(Node temp) {
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	static Node copy = null;
	
	public void CopyList(Node root)
	{
		while(root!=null)
		{
			insertNode(copy,root.data);			
			root=root.next;
		}
		
	}

	public static void main(String[] args) {
		deepCopy pointer = new deepCopy();

		insertNode(head,10);

		insertNode(head,20);

		insertNode(head,30);

		insertNode(head,40);

		insertNode(head,50);


		pointer.display(head);
	
		pointer.display(copy);
	
		
		pointer.CopyList(head);

	}

}
