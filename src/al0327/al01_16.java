package al0327;

public class al01_16 {
	public static void main(String[] args) {
		
	int a = 5;
	
	for(int i = 1; i <= a; i++) {
		
		for (int j = a; j >= i; j--)
			System.out.print(" ");
		for(int j = 1; j <= (i-1)*2+1; j++)
			System.out.print("*");
			System.out.println();
	}
}
}