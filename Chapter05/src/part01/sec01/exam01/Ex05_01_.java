package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_01_ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.printf("�������Է��Ͻÿ�:");
		int a = s.nextInt();

		if (a >= 80) {
			System.out.println("�����մϴ�! �հ� �Դϴ�.");
		}

		if (a < 80) {
			System.out.println("���հ� �Դϴ�.");
		}

		s.close();

	}
}