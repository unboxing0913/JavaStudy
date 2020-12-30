package part01.sec01.exam01;

import java.util.Scanner;

public class ms_02 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 
		 String str;		 
		 char chr;
		 int lm=0,sm=0,su=0;
		 int i=0;
		 
		 
		 
		     System.out.print("문자열을 입력: ");
		     str=s.nextLine();
		  		 		 		     
		     do {
		     chr=(char)str.charAt(i);
			 
			 if(chr>='A'&&chr<='Z') {
				 lm++;
			 }
			 if(chr>='a'&&chr<='z') {
				 sm++;
			 }
			 if(chr>='0'&&chr<='9') {
				 su++;
			 }
			 
			 i++; //do문이 끝날때 i 값을증가시켜서 반복
			 
			 
		 }while(i<str.length());
		       //0< 입력한문자열의갯수보다 작을때까지반복
		
		     System.out.printf("대문자%d개, 소문자%d개, 숫자%d개",lm,sm,su);
	         s.close();

	}
}
