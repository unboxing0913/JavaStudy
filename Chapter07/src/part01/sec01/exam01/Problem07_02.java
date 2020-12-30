package part01.sec01.exam01;

import java.util.Scanner;

public class Problem07_02 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 String str;
		 char ch;
		 int upper_cnt=0,lowe_cnt=0,digit_cnt=0;
		 int i=0;
		 
		 
		 System.out.print("문자열을 입력 : ");
		 str=s.nextLine();
		 
		 i=0;
		 
		 do {
			 ch=str.charAt(i); // 0번째것
			 if(ch>='A'&&ch<='Z') //아스키 코드값 딱히 필요없음.
				 upper_cnt++;// //이거틀려서 못품
			 if(ch>='a'&&ch<='z') 
				 lowe_cnt++;
			 if(ch>='0'&&ch<='9')
				 digit_cnt++;
			 i++; // i값을 증가시켜서 반복해야하기때문
		 }while(i<str.length()); // < 쓰는이유는 문자열 읽을때 0부터 표현하기때문
		 
		 System.out.printf("대문자 %d개, 소문자%d개, 숫자%d개",upper_cnt,lowe_cnt,digit_cnt);
		
         s.close();
	}

}

