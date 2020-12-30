package part01.sec01.exam02;

import java.util.Scanner;

//첫번째 입력하신수가 더큽니다. 두번째 입력하신수가 더큰수입니다. 입력하신 두수는 같은 수입니다.
//첫번째 수를입력 ,두번째수를입력
public class Exam_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, b;

		System.out.print("첫번째 수를 입력 : ");
		a = s.nextInt();
		System.out.print("두번째 수를 입력 : ");
		b = s.nextInt();

		if (a == b)
			System.out.println("입력하신 두수는 같은 수 입니다.");
		else if (a > b)
			System.out.println("첫번째 입력하신수가 더 큰수 입니다.");
		else
			System.out.println("두번째 입력하신수가 더 큰수 입니다.");
		
		System.out.println("프로그램 종료.");


		s.close();
		
//		Scanner s = new Scanner(System.in);
//
//		System.out.print("첫번째 수를 입력:");
//		int a = s.nextInt();
//		System.out.print("두번째 수를 입력:");
//		int b = s.nextInt();
//
//		if (a > b) {
//			System.out.println("첫번째 입력하신수가 더 큰수입니다.");
//		} else if (a < b) {
//			System.out.println("두번째 입력하신수가 더 큰수입니다.");
//		} else {
//			System.out.println("첫번째와 두번째 입력하신 수가 같습니다.");
//		}
//
//		System.out.println("프로그램 종료.");
//		s.close();
	}

}
