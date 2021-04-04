package al0327;

import java.util.Scanner;

public class al01_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a ; 
		
		System.out.println("사각형을 출력합니다");
		System.out.print("단수 : ");
		a = scan.nextInt();
		
		for(int i = 1; i <= a; i++) {
				System.out.println("*****");
		}
	}

}
