package al0404;
import java.util.Scanner;
// �Է� ���� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ��

public class Al02_07 {
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;						// ��ȯ ���� �ڸ���
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(r+ "|" + x);
		System.out.println(" +------");
		do {
			d[digits++] = dchar.charAt(x % r);	// r�� ���� �������� ����
			x /= r;
			System.out.println(r + "|" + x);
			System.out.println(" +------");
		} while (x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;							// ��ȯ�ϴ� ����
		int cd;							// ���
		int dno;						// ��ȯ ���� �ڸ���
		int retry;						// �ٽ� �� ��?
		char[] cno = new char[32];		// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭

		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ������");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36)��");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);		// no�� cd������ ��ȯ

			System.out.print(cd + "�����δ� ");
			for (int i = dno - 1; i >= 0; i--)	
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");

			System.out.print("�� �� �� �ұ��? (1.����0.�ƴϿ�)��");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}