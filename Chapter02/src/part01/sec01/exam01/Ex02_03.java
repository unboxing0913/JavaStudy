package part01.sec01.exam01;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		int a,b;
		int result;
		
		Scanner s=new Scanner(System.in);
		//System.out.println("첫번째 계산할 값을 입력하세요 ==>");
		System.out.print("첫번째 계산할 값을 입력하세요 ==>"); //제목
		a=s.nextInt();
		//System.out.println("두번째 계산할 값을 입력하세요 ==>");
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
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
