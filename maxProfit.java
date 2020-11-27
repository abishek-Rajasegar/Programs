package project;

import java.util.Scanner;

public class maxProfit {

	public static void findNumber(int arr[], int k) {
		if (arr.length == 0)
			System.out.println("0");

		int odd[] = new int[arr.length];
		int eve[] = new int[arr.length];

		for (int l = 0; l < arr.length; l++) {
			odd[l] = 0;
			eve[l] = 0;
		}

		int current[], previous[];

		int d1,d2;
		d1=d2=0;
		for (int i = 1; i < k + 1; i++) {

			int initvalue = -10000000;

			if (i % 2 == 0) {
				current = eve;
				previous = odd;
			}

			else {
				current = odd;
				previous = eve;
			}

			
			for (int j = 1; j < arr.length; j++) {
				initvalue = Math.max(initvalue, previous[j - 1] - arr[j - 1]);
				current[j] = Math.max(current[j - 1], initvalue + arr[j]);
				
				if(current[j]==2)
				{
					d1=i+1;
					d2=j+1;
				}
				

			}

		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(odd[i] + " ");
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(eve[i] + " ");
//		}

		System.out.println();
		
		System.out.println(d1+" "+d2);
//		if (k % 2 == 0) {
//			System.out.println(eve[eve.length - 1]);
//		} else {
//			System.out.println(odd.length - 1);
//		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	//	int k = sc.nextInt();

		findNumber(arr, n);

		sc.close();

	}

}
