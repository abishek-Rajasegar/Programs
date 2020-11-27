package project;

import java.util.Scanner;

public class Main {
	
	static boolean solve(String s1,String s2,int c){
        
        if(s1.equals(s2))
            return true;
        
        if(c>=2)
            return false;
      
        boolean ans=false;
        
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                String d1 = s1.substring(i,j+1);
                String d2 = s1.substring(0,i)+s1.substring(j,1);
                boolean a1 = solve(d1+d2,s2,c+1);
                boolean a2 = solve(d2+d1,s2,c+1);
                boolean a3 = solve(d1,s2,c+1);
                ans = a1||a2;
                ans = ans||a3;
            } 
        }
        
        return ans;
       
    }

	
	
	    public static void main(String[] args)
	    {
	       
	    	Scanner in = new Scanner(System.in);
	        String s = in.nextLine();
	        String str = in.nextLine();
	        
	        System.out.println(solve(str,s,0));
	        
	        in.close();
	        
	    }
	    
	    	    
	  
	}


