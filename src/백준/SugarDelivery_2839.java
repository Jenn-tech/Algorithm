package ����;
import java.util.Scanner;
//���� ����

public class SugarDelivery_2839 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a, b;
			int Sugar, amount = 0;
			System.out.println("��Ű��?");
			Sugar = in.nextInt();
			if (((Sugar%5)%3==0)) {

				a = Sugar/5 ;
				b =(Sugar%5)/3;
				amount= a + b;
				System.out.println(amount);

			}else if (!((Sugar%5)%3==0)) {
				System.out.println("-1");

			}
		}
	}
