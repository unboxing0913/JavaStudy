package part01.sec01.exam01;

import java.util.Scanner;

public class problem05_01 {

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//
//		System.out.print("첫번째 수를 입력하세요.");
//		int a = s.nextInt();
//		System.out.print("계산할 연산자를 입력하세요: ");
//		// System.out.printf("계산할 연산자를 입력하세요: "); 둘다됨 print , printf
//		char ch = s.next().charAt(0);
//		
//		System.out.print("두번째 수를 입력하세요.");
//		int b = s.nextInt();
//
//		
//		if (ch == '+') { // 문자 따옴표
//			System.out.printf("%d+%d=%d입니다.", a, b, a + b);
//		} 
//		if (ch == '-') {
//			System.out.printf("%d-%d=%d입니다.", a, b, a - b);
//		} 
//		if (ch == '*') {
//
//			System.out.printf("%d*%d=%d입니다.", a, b, a * b);			
//		} 
//		if (ch == '/') {
//			System.out.printf("%d/%d=%f입니다.", a, b, a /(float) b);//나눗셈은 값을실수
//		}
//         //if문은 처음부터비교해서 참인값만 계산하는것
//		s.close();
		
//		Scanner s=new Scanner(System.in);
//		int reslut;
//		System.out.println("첫번째 수를 입력하세요.");
//		int a=s.nextInt();
//						
//		System.out.println("계산할 연산자를 입력하세요:");
//		char str = s.next().charAt(0); //
//		
//		System.out.println("두번째 수를 입력하세요.");
//		int b=s.nextInt(); // 순서중요함 코딩은 무조건 위에서 아래로 ....
//		
//		if(str=='+') {
//			reslut=a+b;
//			System.out.println(a+"+"+b+"="+reslut+"입니다.");
//		}else if(str=='-') {
//			reslut=a-b;
//			System.out.println(a+"-"+b+"="+reslut+"입니다.");
//		}else if(str=='*') {
//			reslut=a*b;
//			System.out.println(a+"*"+b+"="+reslut+"입니다.");
//		}else if(str=='/') {
//			reslut=a/b;
//		    System.out.println(a+"/"+b+"="+reslut+"입니다.");
//		}
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("첫번째 수를입력하세요.");
		int a = s.nextInt();
		System.out.print("계산할 연산자를 입력하세요.");
		char su =s.next().charAt(0);
		System.out.print("두번째 수를입력하세요.");
		int b = s.nextInt();
		
		if (su=='+') {
			System.out.print(a+"+"+b+"="+(a+b)+"입니다");
		}else if (su=='-') {
			System.out.print(a+"-"+b+"="+(a-b)+"입니다");
		}else if (su=='*') {
			System.out.print(a+"*"+b+"="+(a*b)+"입니다");
		}else if (su=='/') {
				System.out.print(a+"/"+b+"="+((float)a/b)+"입니다");
		}else {
			System.out.print("잘못된 연산입니다.");
		}
		 s.close();
		
	}
}
/* 1)클래스의 이름:Problem05_01
   2) Scanner 클래스 사용
   3) 임의의 정수를 두개입력받아 다음결과와 같이 출력하세요
   4) if문 사용(+,-,*,/ 사칙연산비교)

첫번째 수를 입력하세요 :10
계산할 연산자를 입력하세요 : *
두번째 수를 입력하세요 : 20
10*20=200입니다.*/