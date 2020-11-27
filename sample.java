package project;

import java.util.*;
public class sample {

	public static int  solution(int[][] m, int col,int n)
	{
		if(col>n)
		{
		     return 1;
		}
		return 1;
	}
	
	public static void createMatrix(int n)
	{
		int matrix[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<0;j++)
			{
				matrix[i][j]=0;
			}
		}
		
		solution(matrix,0,n);
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		createMatrix(n);
		
		sc.close();
	}
	
}
