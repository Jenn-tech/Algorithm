package al0327;

public class al01_15_triangleLU {

	public static void main(String[] args) {
		int a = 5;
		
		for(int i = 1; i <= a ; i++) {
			for (int j = a; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
	}

}