package ����;
import java.util.Scanner;

public class Snail_2869 {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int A;//�ö󰡴�
			int B;//�̲�������
			int V;//�ö� ����
			int sum; //�Ϸ� �ö󰡴�
			
			System.out.print("�ö󰡴� ����");
			A = in.nextInt();
			System.out.print("�̲������� ����");
			B = in.nextInt();
			System.out.print("�ö� ������ ����");
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
