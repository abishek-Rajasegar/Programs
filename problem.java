
package project;


import java.util.*;


public class problem {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		

		int sum = 0;
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				
				int b = sc.nextInt();
				
				a1.add(b);
				sum += b;
			}
			a.add(a1);
		}
		sc.close();
		System.out.println(a+" "+sum);
		int max= sum/t;
		
		for(int k=0;k<a.size();k++)
		{
		    int s = a.get(k).stream().filter(i -> i != 0).mapToInt(i -> i).sum();
		     
		    	 if(s==max)
		    	 {
		    		 continue;
		    	 }
		    		     
		}

	}

}


