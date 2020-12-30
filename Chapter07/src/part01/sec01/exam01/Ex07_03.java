package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
	          @SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
	          int a,b;
	          
	          while(true) { // 무한으로 입력받음
	        	  System.out.print("더할 첫번째 수 입력:");
	        	  a=s.nextInt();
	        	  System.out.print("더할 두번째 수 입력:");
	        	  b=s.nextInt();
	        	  
	        	  
	        	  System.out.printf("%d+%d=%d\n",a,b,a+b);
	        	  
	        	   }
	          
	}

}
