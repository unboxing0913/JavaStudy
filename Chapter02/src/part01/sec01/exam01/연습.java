package part01.sec01.exam01;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("수를 입력하시오: ");
		 int a=s.nextInt();
		 
		 if(a%3==0) 
		 System.out.print("3의배수가 맞습니다.");
		 		 
		 else
		 System.out.print("3의배수가 아닙니다.");
		 
		 
		 
		 s.close();
		 
	    
		
		
	}

}
