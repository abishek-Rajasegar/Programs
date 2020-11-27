package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pairSum {
	
	
	public static void findPairs(List<Integer> lst,int n,int k)
	{
		int count=0;
		for(int i=0;i<n-1;i++)
		{
		
			List<Integer> temp = lst.subList(i+1, n-1);
			
			if( temp.contains( Math.abs( k+(lst.get(i)%k) ) ) )
			{
				//System.out.println(lst.get(i));
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of ele required");
		int n = sc.nextInt();
		
		List<Integer> lst = new ArrayList<>();
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			int b = sc.nextInt();
			lst.add(b);
		}
		System.out.println("Enter K value");
		int k = sc.nextInt();
		
		System.out.println();
		findPairs(lst,n,k);
		
		
		sc.close();
		
		
	}

}
