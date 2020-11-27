package project;

import java.util.Scanner;

public class dim {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			   a[i][j] = sc.nextInt();		
			}
		}
				
		int midx = n/2;
		int midy = n/2;
		
		int Ssum = a[midx-1][midy] + a[midx][midy-1] + a[midx+1][midy]+ a[midx][midy+1];
		
		int lsum =  0;
		
		int principal = 0;
		int secondary = 0;
		
		
		for (int i = 0; i <=n/2; i++) {        
			principal += a[i][i];         
        }
		
		for (int i = n/2; i <n-1; i++) {        
			secondary += a[i][n-i-1];         
        }
		
		for (int i = n/2; i <=n/2; i++) {        
			principal += a[i][i];         
        }
		
		for (int i = n/2; i <=n-1; i++) {        
			secondary += a[i][n-i-1];         
        }
			
	    lsum = principal + secondary;
			
	    System.out.println(lsum + Ssum);
		
		sc.close();
	}
}


