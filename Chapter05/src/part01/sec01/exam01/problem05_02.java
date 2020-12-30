package part01.sec01.exam01;

import java.util.Scanner;
//
public class problem05_02 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 수를 입력하세요.");
		int a = s.nextInt();
		System.out.print("계산할 연산자를 입력하세요: ");
		char ch = s.next().charAt(0);
		
		System.out.print("두번째 수를 입력하세요.");
		int b = s.nextInt();

		
		if (ch == '+') { 
			System.out.printf("%d+%d=%d입니다.", a, b, a + b);
		} 
		else if (ch == '-') {
			System.out.printf("%d-%d=%d입니다.", a, b, a - b);
		} 
		else if (ch == '*') {

			System.out.printf("%d*%d=%d입니다.", a, b, a * b);
			System.out.println("전부비교할까요?");
		} 
		else  if(ch == '/') {
			System.out.printf("%d/%d=%f입니다.", a, b, a /(float) b);
		}
		else
			System.out.print("연산자를 잘못입력했습니다.\n");
		//System.out.println("전부비교할까요?");
		
		s.close();
		

	}
}
