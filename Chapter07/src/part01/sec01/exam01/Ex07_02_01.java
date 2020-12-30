package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_02_01 {

	public static void main(String[] args) {
	         Scanner rd=new Scanner (System.in);
		     int i=0;
	         int n=0;
	         double sum=0;
	    while((i = rd.nextInt())!=0) { // 하나의 값으로처리
	    	
	    	 n++; // 갯수조정
		     sum = sum+i; 	// 누적합을계산
		}
		
	     
	System.out.println("입력된 수의 개수는"+n+"개이며 평균은"+sum/n+"입니다.");
	
	
	rd.close();	
	}

}
