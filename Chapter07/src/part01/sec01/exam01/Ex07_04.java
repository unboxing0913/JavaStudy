package part01.sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {

	public static void main(String[] args) throws IOException {
		
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		  int a,b;
		  char ch;
		  
		  while(true) {
			  System.out.print("첫번째 수 입력:");
        	  a=s.nextInt();
        	  System.out.print("두번째 수 입력:");
        	  b=s.nextInt();
        	  System.out.print("계산할 연산자를 입력하세요");
        	  
        	  ch=(char)System.in.read();//문자 하나를 읽는다 (실질적으로 정수값으로 처리됨)
        	  
        	  switch(ch) {
        	  case '+'://<==올수잇는것 : 정수값,문자열  (실수값은 안됨)
        		  System.out.printf("%d+%d=%d\n",a,b,a+b);
        		  break;
        	  case '-':
        		  System.out.printf("%d-%d=%d\n",a,b,a-b);
        		  break;
        	  case '*':
        		  System.out.printf("%d*%d=%d\n",a,b,a*b);
        		  break;
        	  case '/':
        		  System.out.printf("%d/%d=%d\n",a,b,a/b);
        		  break;
        	  case '%':
        		  System.out.printf("%d%%%d=%d\n",a,b,a%b);
        		  break;
        	  default:
        		  System.out.printf("연산자를 잘 못 입력했습니다.\n");
        	  }
        	 
        	  
        	  
		  }
		

	}

}
