package 백준;
import java.util.Scanner;

public class Snail_2869 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int A;//올라가는
			int B;//미끄러지는
			int V;//올라갈 높이
			int sum; //하루 올라가는
			
			System.out.print("올라가는 높이");
			A = in.nextInt();
			System.out.print("미끄러지는 높이");
			B = in.nextInt();
			System.out.print("올라갈 나무의 높이");
			V = in.nextInt();
			
			for (int i = 0; i < V; i++) {
				sum = (i) + A - B;
				sum += sum;
				if (i+A >V) {
					System.out.println(i);
					return;
				}
			}
		}
	}
