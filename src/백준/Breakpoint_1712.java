package 백준;

import java.util.Scanner; //백준 손익분기점
public class Breakpoint_1712 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);

			int A, B, C ;
			int BreakPoint;
			System.out.print("고정비용입력 : ");
			A = in.nextInt();
			System.out.print("가변비용입력 : ");
			B = in.nextInt();
			System.out.print("상품가격입력 : ");
			C = in.nextInt();

			try {
				for (BreakPoint= 1; BreakPoint < BreakPoint+1; BreakPoint++) {
					if (BreakPoint > A/(C-B)) {
						System.out.println("손익분기점 : " + BreakPoint);
						break;
					}
				}} catch (ArithmeticException e) {
					System.out.println("-1");
				}

		}
	}
