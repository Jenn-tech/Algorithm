package al0327;

public class al01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <=9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("--+-------------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.print(i+"|");
			for(int j = 1 ; j <= 9; j++)
				System.out.printf("%3d", i + j);
		System.out.println();
		}
	}

}
