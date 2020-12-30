package part01.sec10.exam01;

import java.util.Scanner;

public class mu_03 {

	public static void main(String[] args) {
		
//		 Scanner s=new Scanner(System.in);
//		 System.out.print("임의의 정수를 입력하세요>>");
//		 
//		 int a = s.nextInt();
//		 int i;
//		 int j;
//		 
//		 
//		 if(a==0) {
//			 System.out.println("0보다 커야합니다.");
//		 }
//		 
//		    //1;1<=5;1++
//		for(i=1;i<=a;i++) {
//			   //1;1<=1/2/3/4/5;1++
//		   for(j=1;j<=i;j++)	 {
//		System.out.print('*');
//		   }System.out.println();
//		}
//		   
//		   //5;5<=0;5--
//		for(i=1;i<=a;i++) {
//			for(j=1;j<=i;j++) {
//	            
//		   System.out.print('*');		    
//		}   System.out.println();					   				    
//		}
		
		Scanner s = new Scanner(System.in);
	      System.out.print("임의의 정수를 입력하세요>>");

	      int a = s.nextInt();
	      int i;
	      int j;

	      if (a == 0) {
	         System.out.println("0보다 커야합니다.");
	      } else {

	         for (i = 1; i <= a; i++) {//1 2 3 4 5
	        	 
	            for (j = 1; j <= i; j++) { // 1 2 3 4 5
	               System.out.print('*');
	             
	            }
	            System.out.println();
	         }
	         
	         System.out.println("%%%%%%%%%%%%%%%");

	         for (i = a; i >= 0; i--) {	  	        	 
	            for (j = 1; j <= i; j++) {
	               System.out.print('*');
	            }
	            System.out.println();
	         }
	      }

		

		
	}
	}
	


