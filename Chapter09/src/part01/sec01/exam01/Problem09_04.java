package part01.sec01.exam01;

import java.util.Scanner;

public class Problem09_04 {
	
//	public static int factorial(int num) {
//		if(1==num) {
//			return 1;
//		}
//		return num*factorial(num-1);
//	}
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int i;		
//		System.out.printf("정수를 입력하세요==>");
//		int num=s.nextInt();
//		for(i=1;i<=num;i++) {		
//		System.out.printf("%d! = %d\n",i,factorial(i));
//		}
//		s.close();
	
	public static int factorial(int num) {
		int hap=1;
		for(int i=2;i<=num;i++) {
			hap*=i;	
		}		
		return hap;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;		
		System.out.printf("정수를 입력하세요==>");
		int num=s.nextInt();
		for(i=1;i<=num;i++) {		
		System.out.printf("%d! = %d\n",i,factorial(i));
		}
		s.close();
		
	}

}
