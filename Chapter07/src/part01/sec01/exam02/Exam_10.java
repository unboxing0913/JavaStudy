package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
	     Scanner in=new Scanner(System.in);
	     int i;
	     int sum=0;
	     while(true) {
	    	 System.out.print("������ ���� �Է�:");	    	 
	    	 i = in.nextInt();
	    	 
	    	 if(i<0) {
	    		 break;
	    	 }
	    	 
	    	 sum=sum+i;
	    	
	    	 }	     
	          System.out.println("�Է��Ͻ� ���� �� ����"+sum+"�Դϴ�.");
	          in.close();
	   

	}

}
