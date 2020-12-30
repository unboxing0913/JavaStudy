package part01.sec01.exam01;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("수식을 한 줄로 띄어쓰기로 입력:");
		 String[] str = s.nextLine().split(" ");
	                         //nextLine 배열쓸때 문자열!!!!!!!!!!	
		 char a = str[1].charAt(0); //0부터시작 
		
		 int c = Integer.parseInt(str[0]);
		
		 int d = Integer.parseInt(str[2]);
		 
		 switch(a) {
		 
		 case '+':			
			 System.out.println(c+"+"+d+"="+(c+d));
			 break;
		 case '-':			
			 System.out.println(c+"-"+d+"="+(c-d));
			 break;			
		 case '*':
			 System.out.println(c+"*"+d+"="+(c*d));
			 break;
		 case '/':
			 System.out.println(c+"/"+d+"="+(float)(c/d));
			 break;
		 default:
			 System.out.println("잘못입력하셨습니다");
			 s.close();
		 }

}

}
