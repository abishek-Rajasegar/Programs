package project;

public class queuq {
	
   
   public static int fr,la;
   public static int max=1000;
   public static int arr[] = new int[max];

   queuq()
   {
	   fr=-1;
	   la=-1;
   }
   
   public void enqueue(int v)
   {
	   ++fr;
	   if(fr>max-1)
	   {
		   System.out.println("Over Flow");
	   }
	   else
	   {
		   arr[fr]=v;
	   }
   }
   
   
   public int dequeue()
   { 
	   ++la;
	   
	   if(la < 0)
	   {
		   System.out.println("Under Flow");
		   return 0;
	   }
	   else
	   {
		   int x = arr[la];
		   return x;
	   }
   }
   
   
   public void display()
   {
	   for(int i=la+1;i<=fr;i++)
	   {
		   System.out.println(arr[i]);
	   }
   
   }
   	
	public static void main(String[] args)
	{
		
		queuq q = new queuq();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);	
		
		q.display();
		
		System.out.println("");
		
		q.dequeue();
		q.display();
		
		System.out.println("");
		
		q.dequeue();
		q.display();
					
	}

}
