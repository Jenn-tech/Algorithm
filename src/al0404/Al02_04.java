package al0404;
//b�� ��� ��Ҹ� a�� ����
public class Al02_04 {
	static void copy(int[] a, int[] b) {
		a = new int[b.length];
		a = b.clone();
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int[]a = {1, 2, 3, 4, 5};
		int[]b = {3,5,36};
		copy(a, b);
	}

}
