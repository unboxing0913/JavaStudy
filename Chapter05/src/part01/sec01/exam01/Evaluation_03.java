package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_03 {

	public static void main(String[] args) {
	  
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("당신의 주민등록번호를 입력하세요.(ex123456-1111111)=>");
		 String str = s.next();
		 char jender = str.charAt(7);
		 
		 switch(jender) {
		 case '1':
		 case '3':
			 System.out.println("당신은 남자입니다.");
			 break;
		 case '2':
		 case '4':
			 System.out.println("당신은 여자입니다.");
		 default:
			 System.out.println("잘못 입력하셨습니다.");
			 			 
			 }
		  s.close();
		

	}

}
