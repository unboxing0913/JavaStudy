package part01.sec01.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		 
		Scanner s=new Scanner(System.in);
		
		System.out.print("수식을 한 줄로 띄어쓰기로 입력 :");//입력먼저받고 정수바꿈
		int a,b;
		String[] ex ;
		
		ex =s.nextLine().split(" ");//문자열을받고 배열을 " " 로 나눠라
	    
		a = Integer.parseInt(ex[0]);
		
	    char chr = ex[1].charAt(0);
				
	    b = Integer.parseInt(ex[2]);
		
		
		
		
		switch(chr){
			case '+':{
			    int result = a+b;
				System.out.printf("%d+%d=%d입니다.",a,b,result);
				break;}
			case '-':{
			    int result = a-b;
				System.out.printf("%d-%d=%d입니다.",a,b,result);
				break;}
			case '*':{
			    int result = a*b;
				System.out.printf("%d*%d=%d입니다.",a,b,result);
				break;}
			case '/':{
			    int result = a/b;
				System.out.printf("%d/%d=%f입니다.",a,b,(float)result);
				break;}
			default :
				System.out.print("잘못 입력하셨습니다.");
				
				s.close();
					
		}
		  
		

	}

}
