package al0404;
import java.util.Scanner;
// �� �� ���� �ϼ��� ����

public class Al02_09 {
	// �� ���� �� ��
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ����
	};

	// ���� year���� �����ΰ�? (���⣺1����⣺0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// ���� y�� m�� d���� �� �� ��� �ϼ��� ����
	static int leftDayOfYear(int y, int m, int d) {
		int year = isLeap(y);
		while(m-1!=0) {
		d +=mdays[year][m-1];
		m--;
		}
		d = 365-d;
		return d;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;							// �ٽ� �� ��?

		System.out.println("�� �� ��� �� ���� ���մϴ�.");

		do {
			System.out.print("�⣺");  int year  = stdIn.nextInt();	// ��
			System.out.print("����");  int month = stdIn.nextInt();	// ��
			System.out.print("�ϣ�");  int day   = stdIn.nextInt();	// ��

			System.out.printf("���� ���� %d���Դϴ�.\n", leftDayOfYear(year, month, day));

			System.out.print("�ѹ� �� �ұ��? (1.����0.�ƴϿ�����");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}