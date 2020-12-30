package part01.sec01.exam01;

import java.util.Scanner;

//10진수 %d , 16진수 %x , 8진수 %o
public class Problem03_01 {

	public static void main(String[] args) {
		
	    int a; //컴퓨터가 자동으로 연산해주니깐 변수선언1개
		
	    Scanner s=new Scanner(System.in); //대문자소문자좀 구별하자
		                                  // 받아오는 하나만입력
        System.out.printf("정수를입력하세요==>");
		a=s.nextInt();//키보드로부터 데이터주는 코드
				
		System.out.printf("10진수 ==> %d\n",a);
	
		System.out.printf("16진수 ==>%X\n",a); //16진수는 %x를 대문자로주면 대문자출력
		                                      //소문자로주면 소문자출력
		
		System.out.printf("8진수 ==> %o\n",a);
	
		s.close();//scanner 닫아주기
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요==>");
//		
//		int a=s.nextInt();
//		
//		
//	    System.out.printf("10진수 ==>%d\n",a);					
//		System.out.printf("16진수 ==>%x\n",a);		
//		System.out.printf("8진수 ==>%o\n",a);
//		s.close();
		
		
        
	}

}
