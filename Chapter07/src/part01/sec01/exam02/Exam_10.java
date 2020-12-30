package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
	     int i;
	     int sum=0;
	     while(true) {
	    	 System.out.print("임의의 수를 입력:");	    	 
	    	 i = in.nextInt();
	    	 
	    	 if(i<0) {
	    		 break;
	    	 }
	    	 
	    	 sum=sum+i;
	    	
	    	 }	     
	          System.out.println("입력하신 수의 총 합은"+sum+"입니다.");
	          in.close();
	   

	}

}
