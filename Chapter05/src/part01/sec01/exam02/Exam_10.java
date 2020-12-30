package part01.sec01.exam02;

import java.util.Scanner;

//임의의 수를 입력 3과5의배수 . 3의배수 5의배수 3과5의배수 
public class Exam_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("임의의 수를 입력 : ");
		int a = s.nextInt();

		if (a % 3 == 0 && a % 5 == 0) // 조건을 둘다 만족하기위해 논리연산자 AND 사용
			System.out.println("입력하신수는 3과 5의 배수입니다.");
		else if (a % 3 == 0)
			System.out.println("입력하신수는 3의 배수입니다.");
		else if (a % 5 == 0)
			System.out.println("입력하신수는 5의배수입니다.");

		s.close();

//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("임의의 수를 입력: ");
//		int a=s.nextInt();
//		
//		if(a%3==0 && a%5==0) {
//			System.out.println("입력하신 수는 3과 5의 배수입니다.");
//		}else if(a%3==0) {
//			System.out.println("입력하신수는 3의배수입니다.");
//		}else if(a%5==0) {
//			System.out.println("입력하신수는 5의배수입니다.");
//		}else {
//			System.out.println("입력하신수는 3또는 5의배수가 아닙니다.");
//		}
//	      s.close();
	}

}
