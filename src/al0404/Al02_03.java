package al0404;

import java.util.Scanner;

public class Al02_03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print((i+1) + "번쨰 수 :");
			a[i] = scan.nextInt();
		}
		System.out.println("합계: + " + sumOf(a));
	}

}
