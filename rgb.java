package project;

import java.util.*;
public class rgb {

		public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
		
			String s = sc.next();
			char[] a = s.toCharArray();
	    	
	    	for(int i=0;i<a.length;i++)
	    	{
	    	    
	    	     if(a[i]=='G')
	    	    {
	    	        int ind=0;
	    	        for(int j=i+1;j<=a.length-1;j++)
	    	        {
	    	            if(a[j]=='R')
	    	            {
	    	                 ind= j;
	    	            }
	    	        }
	    	        char team = a[i];
	    	        a[i]=a[ind];
	    	        a[ind]=team;
	    	    }
	    	    
	    	    else if(a[i]=='B')
	    	    { 
	    	        int f=0,ind=0;
	    	        for(int j=i+1;j<=a.length-1;j++)
	    	        { 
	    	            if(a[j]=='R')
	    	            {
	    	                 f=1;
	    	                 ind= j;
	    	            }
	    	        }
	    	        if(f==1)
	    	        {
	    	        char team = a[i];
	    	        a[i]=a[ind];
	    	        a[ind]=team;
	    	        }
	    	        
	    	        
	    	        else if(f==0)
	    	        {
	    	           
	    	            for(int j=i+1;j<=a.length-1;j++)
	    	        { 
	    	            if(a[j]=='G')
	    	            {
	    	                 ind= j;
	    	            }
	    	        }
	    	        char team = a[i];
	    	        a[i]=a[ind];
	    	        a[ind]=team;
	    	            
	    	        }
	    	    }
	    	    
	    	}
		
	    	for(int i=0;i<a.length;i++)
	    	{
	    	System.out.print(a[i]);
	    	}
		
		sc.close();
		}

	
}
