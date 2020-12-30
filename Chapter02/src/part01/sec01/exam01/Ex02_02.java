package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		int a,b;
		int result;

		Scanner s=new Scanner(System.in);
		a=s.nextInt(); // 정수 읽음
		b=s.nextInt();
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);//괄호안의내용출력
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result);//괄호안의내용출력
		
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);//괄호안의내용출력
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);//괄호안의내용출력
		
		s.close();
	}

}
