package project;


import java.util.*;

public class specialNumber {

	static int count1=0;
	
	public static void find(ArrayList<Integer> a, ArrayList<Integer> a1, int data, int i) {
		for (int ind = i; ind < a.size(); ind++) {
			if (a.get(ind)==data) {
			    
				a1.add(data);
				
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a.add(b);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0, count = 0, ind = 0;
				for (int k = i; k <= j; k++) {
					sum += a.get(k);
					count++;
					ind = k;

				}
				if (count > 1) {
					find(a, a1, sum, ind);
				}
			}
		}

		System.out.println(count1+a1.size());

		sc.close();
	}
}
