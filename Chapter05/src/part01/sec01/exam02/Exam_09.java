package part01.sec01.exam02;

import java.util.Scanner;

//ù��° �Է��Ͻż��� ��Ů�ϴ�. �ι�° �Է��Ͻż��� ��ū���Դϴ�. �Է��Ͻ� �μ��� ���� ���Դϴ�.
//ù��° �����Է� ,�ι�°�����Է�
public class Exam_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, b;

		System.out.print("ù��° ���� �Է� : ");
		a = s.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		b = s.nextInt();

		if (a == b)
			System.out.println("�Է��Ͻ� �μ��� ���� �� �Դϴ�.");
		else if (a > b)
			System.out.println("ù��° �Է��Ͻż��� �� ū�� �Դϴ�.");
		else
			System.out.println("�ι�° �Է��Ͻż��� �� ū�� �Դϴ�.");
		
		System.out.println("���α׷� ����.");


		s.close();
		
//		Scanner s = new Scanner(System.in);
//
//		System.out.print("ù��° ���� �Է�:");
//		int a = s.nextInt();
//		System.out.print("�ι�° ���� �Է�:");
//		int b = s.nextInt();
//
//		if (a > b) {
//			System.out.println("ù��° �Է��Ͻż��� �� ū���Դϴ�.");
//		} else if (a < b) {
//			System.out.println("�ι�° �Է��Ͻż��� �� ū���Դϴ�.");
//		} else {
//			System.out.println("ù��°�� �ι�° �Է��Ͻ� ���� �����ϴ�.");
//		}
//
//		System.out.println("���α׷� ����.");
//		s.close();
	}

}
