package ����;

import java.util.Scanner; //���� ���ͺб���
public class Breakpoint_1712 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);

			int A, B, C ;
			int BreakPoint;
			System.out.print("��������Է� : ");
			A = in.nextInt();
			System.out.print("��������Է� : ");
			B = in.nextInt();
			System.out.print("��ǰ�����Է� : ");
			C = in.nextInt();

			try {
				for (BreakPoint= 1; BreakPoint < BreakPoint+1; BreakPoint++) {
					if (BreakPoint > A/(C-B)) {
						System.out.println("���ͺб��� : " + BreakPoint);
						break;
					}
				}} catch (ArithmeticException e) {
					System.out.println("-1");
				}

		}
	}
