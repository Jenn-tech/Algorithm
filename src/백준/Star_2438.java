package 백준;
//입력받은 수만큼 별찍기
import java.util.Scanner;

public class Star_2438 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("숫자 입력 : ");
			int n = in.nextInt();
			
			for (int i =0; i <n; i++) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}

	}
