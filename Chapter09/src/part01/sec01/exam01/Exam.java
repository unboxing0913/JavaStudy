package part01.sec01.exam01;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		int select;
		int a,b;
		double c,d;
		int result;
		double result1;
		System.out.print("계산 입력(1:+,2:-,3:*,4:/)");
		select = s.nextInt();
		
		
		switch(select) {
		
		case 1:
			System.out.print("첫번째 숫자 입력: ");
			a = s.nextInt();
			System.out.print("두번째 숫자 입력: ");
			b = s.nextInt();
			result = hap(a,b);
			System.out.println("계산된결과는"+result);
			break;
		case 2:
			System.out.print("첫번째 숫자 입력: ");
			a = s.nextInt();
			System.out.print("두번째 숫자 입력: ");
			b = s.nextInt();
			result = minus(a,b);
			System.out.println("계산된결과는"+result);			
			break;
		case 3:
			System.out.print("첫번째 숫자 입력: ");
			a = s.nextInt();
			System.out.print("두번째 숫자 입력: ");
			b = s.nextInt();
			result = mul(a,b);
			System.out.println("계산된결과는"+result);
			break;
		case 4:
			System.out.print("첫번째 숫자 입력: ");
			c = s.nextDouble();
			System.out.print("두번째 숫자 입력: ");
			d = s.nextDouble();
			result1 = div(c,d);
			System.out.println("계산된결과는"+result1);
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
		
		
		}
          s.close();
	}
	
	public static int hap(int a,int b) {
		return a+b;
	}
    public static int minus(int a,int b) {
    	return a-b;
	}
    public static int mul(int a,int b) {
    	return a*b;
	}
    public static double div(double c,double d) {
    	return c/d;
	}
	

}
