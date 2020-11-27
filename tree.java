package project;

public class tree {

	static int count =0;
	class Node { 
		int key; 
		Node left, right; 

		public Node(int item) { 
			key = item; 
			left = right = null; 
		} 
	} 

	 static Node root; 

	tree() { 
		root = null; 
	} 
 
	void insert(int key) { 
	root = insertRec(root, key); 
	} 
	
	Node insertRec(Node root, int key) { 

		if (root == null) { 
			root = new Node(key); 
			return root; 
		} 

		if (key < root.key) 
			root.left = insertRec(root.left, key); 
		else if (key > root.key) 
			root.right = insertRec(root.right, key); 

		return root; 
	} 

	void inorder() { 
	inorderRec(root); 
	} 
 
	void inorderRec(Node root) { 
		if (root != null) { 
			inorderRec(root.left); 
			System.out.println(root.key);
			count++;
			inorderRec(root.right); 
		} 
	} 
	
	static int leafCount(Node temp)
	{
		if(temp == null)
			return 0;
		else if(temp.left==null && temp.right==null)
			return 1;
		else
			return leafCount(temp.left) + leafCount(temp.right); 
	}

	public static void main(String[] args) { 
		  tree tree = new tree(); 

	
		tree.insert(50); 
		tree.insert(30); 
		tree.insert(20); 
		tree.insert(40); 
		tree.insert(70); 
		tree.insert(60); 
		tree.insert(80); 

		tree.inorder();
		
		System.out.println();
		System.out.println(leafCount(root));
		System.out.println(count-1);
	} 
} 
