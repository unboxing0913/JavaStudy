package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_01_ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.printf("점수를입력하시오:");
		int a = s.nextInt();

		if (a >= 80) {
			System.out.println("축하합니다! 합격 입니다.");
		}

		if (a < 80) {
			System.out.println("불합격 입니다.");
		}

		s.close();

	}
}