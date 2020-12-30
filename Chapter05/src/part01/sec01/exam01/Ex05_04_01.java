package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_04_01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("수를 입력하시오:");
		int a = s.nextInt();
		if (a % 3 == 0)// 3의배수는 3으로나눴을때 0 ==> 나눳을때 나머지 연산자0을찾으면 3의배수
						// a를3으로 나눴을때 나머지0 3의배수 제발기억해제발 %%%%%%
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
        s.close();
		
//		Scanner s = new Scanner(System.in);
//		int a =s.nextInt();
//		
//		if(a%3==0) {
//				System.out.printf("3의배수가 맞습니다.");
//		}else
//		System.out.printf("3의배수가 아닙니다.");
//        s.close();
	}

}
