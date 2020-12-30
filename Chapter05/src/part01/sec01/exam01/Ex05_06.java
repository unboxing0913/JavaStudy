package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;

		System.out.print("정수를 입력하세요:");
		a = s.nextInt();

		if (a % 2 == 0) { //2의배수는 전부 짝수
			System.out.println("짝수를 입력했군요..");
		} else {
			System.out.println("홀수를 입력했군요..");
		}
		s.close();
		
//		Scanner s=new Scanner(System.in);
//			
//		System.out.print("정수를 입력하세요:");
//		int a=s.nextInt();
//		
//		if(a%2==0)
//		System.out.print("짝수를 입력했군요");
//		else
//		System.out.print("홀수를 입력했군요");
//
//		s.close();
	}
}
