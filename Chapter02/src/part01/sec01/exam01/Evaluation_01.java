package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		
		

		System.out.print("첫번째 게산할 값을 입력하세요==>");
		int a = s.nextInt();
		System.out.print("두번째 게산할 값을 입력하세요==>");
		int b = s.nextInt();
		System.out.print("세번째 게산할 값을 입력하세요==>");
		int c = s.nextInt();
		System.out.print("네번째 게산할 값을 입력하세요==>");
		int d = s.nextInt();		
		
		int result = a+b+c+d;
	    System.out.printf("%d+%d+%d+%d=%d",a,b,c,d,result);
	    
	    s.close();
		
	}

}
