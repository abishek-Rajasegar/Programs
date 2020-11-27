package project;


public class stack {
	
	public static int top;
	public static int max=1000;
	public static int a[] = new int[max];
	stack()
	{
		top=-1;
	}
	
	public void push(int v)
	{
		++top;
		if(top>max-1)
		{
			System.out.println("stack over flow");
		}
		else 
		{
			a[top]=v;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
		
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
		{ 
			System.out.println(a[i]+" ");
		}
	}


		 
		public static void main(String[] args) 
		{ 
		 
			stack s = new stack();
			
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(10);
			s.display();
			s.pop();
			System.out.println("");
			s.display();
		
			s.pop();
			System.out.println("");
			s.display();
		
			
			
		} 
		
	}
		
	
	
