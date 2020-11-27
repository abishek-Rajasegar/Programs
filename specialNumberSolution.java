package project;

import java.util.Scanner;

public class specialNumberSolution {

	static int count=0;
	public static void find(int a[],int num,int i,int n)
	{
		
		for(int j=i-1;j>=0;j--)
		{
			for(int k=j;k>=0;k--)
			{
				int c=0,sum=0;
				for(int l=j;l>=k;l--)
				{
					sum+=a[l];
					c++;
					
				}
				if(sum==num && c>1)
				{
					count++;
					break;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=2;i<n;i++)
		{
			find(a,a[i],i,n);
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
