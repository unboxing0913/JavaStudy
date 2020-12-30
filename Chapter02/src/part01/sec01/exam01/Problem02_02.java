package part01.sec01.exam01;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		int a,b;
		int result;
		int k;
		
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");//제목
		a = s.nextInt();
		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==>");//2번째 제목->4문항
		k = s.nextInt();//k가 4문항
		System.out.print("두번째 계산할 값을 입력하세요 ==>");//제목
		b = s.nextInt();
		
		if(k==1) { // ==는 관계연산자 같으냐라고물어보는것 =는 대입연산자[메모리(저장)공간=값]
			
			result=a+b;//1이면 더하기
			System.out.println(a+"+"+b+"="+result);//제목
		}
		if(k==2) {
			result=a-b;//2면 빼기
		    System.out.println(a+"-"+b+"="+result);		   		
	}
		if(k==3) {
			result=a*b;//3이면 곱셈
		    System.out.println(a+"*"+b+"="+result);	
}
		if(k==4) {
			result=a/b;//4면 나눗셈
		    System.out.println(a+"/"+b+"="+result);	
		    
		
		}
		
		s.close();//출력 후 종료 혹은 1,2,3,4 숫자가없을경우 종료
		
		
//		Scanner s=new Scanner(System.in);
//		int a,b,c;
//		int reslut;
//		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
//		a=s.nextInt();
//		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈==>");//+,-,*,/
//		b=s.nextInt();
//		System.out.print("두번째 계산할 값을 입력하세요 ==>");
//		c=s.nextInt();
//		
//		
//		if(b==1) {	
//		    reslut = a+c;
//		    System.out.printf("%d+%d=%d",a,c,reslut);
//		 }else if(b==2){ 
//		    reslut = a-c;
//		    System.out.printf("%d-%d=%d",a,c,reslut);
//		 }else if(b==3) {
//		    reslut = a*c;
//		    System.out.printf("%d*%d=%d",a,c,reslut);		    
//	     }else if(b==4) {
//	        reslut = a/c;
//	        System.out.printf("%d*%d=%d",a,c,reslut);
//	     }
//		    
//		    s.close();
	}
}
