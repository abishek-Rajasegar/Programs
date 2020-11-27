package project;

import java.util.Scanner;

public class nqueen {
 
static int N = 5; 

static int []ld = new int[30]; 


static int []rd = new int[30]; 


static int []cl = new int[30]; 


static void printSolution(int board[][]) 
{ 
	for (int i = 0; i < N; i++) 
	{ 
		for (int j = 0; j < N; j++) 
			System.out.printf(" %d ", board[i][j]); 
		System.out.printf("\n"); 
	} 
} 


static boolean solveNQUtil(int board[][], int col) 
{ 

	if (col >= N) 
		return true; 

	for (int i = 0; i < N; i++) 
	{ 

		if ((ld[i - col + N - 1] != 1 && 
			rd[i + col] != 1) && cl[i] != 1) 
		{ 
			
			board[i][col] = 1; 
			ld[i - col + N - 1] = 
			rd[i + col] = cl[i] = 1; 

			if (solveNQUtil(board, col + 1)) 
				return true; 

			board[i][col] = 0; 
			ld[i - col + N - 1] = 
			rd[i + col] = cl[i] = 0; 
		} 
	} 

	return false; 
} 

static boolean solveNQ(int n) 
{ 
	
	int board[][] = new int[n][n];
	if(n>0)
	{
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  board[i][j]=0;
		  }
	  }
	}
	
	
	if (solveNQUtil(board, 0) == false) 
	{ 
		System.out.printf("Solution does not exist"); 
		return false; 
	} 

	printSolution(board); 
	return true; 
} 

public static void main(String[] args) 
{ 
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	solveNQ(n); 
	sc.close();
} 
} 


