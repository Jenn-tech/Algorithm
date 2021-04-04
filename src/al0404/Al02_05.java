package al0404;
//b의 모든 요소를 a에 역순으로 복사
public class Al02_05 {
	static void rcopy(int[] a, int[] b) {
		a = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length-(i+1)];
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[]a = {1, 2, 3, 4, 5};
		int[]b = {1, 2, 3, 4, 6, 7};
		rcopy(a, b);
	}

}
