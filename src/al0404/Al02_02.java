package al0404;

import java.util.Scanner;

public class Al02_02 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	
	static void reverse(int[] a ) {
		for (int i = 0; i<a.length/2; i++) {
			
			System.out.println("a["+ i +"]과(와) a[" + (a.length-i-1) + "]를 교환합니다.");
			swap(a, i, a.length-i-1);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int[] x = {5, 10, 73, 2, -5, 42};
		for (int i = 0; i < x.length; i++) {
			
			System.out.print(x[i]);
			System.out.print(" ");
		}
		System.out.println();
		reverse(x);
		
		System.out.println("역순 정렬 완");	
		
	}

}
