package part01.sec10.exam01;

import java.util.Scanner;

public class Evaluation_07 {

	public static void main(String[] args) {
		      Scanner s=new Scanner(System.in);
		      
		      System.out.print("임의의 정수를 입력하세요>>");
		      int a = s.nextInt();
		      
		     
		      for(int i=1;i<=a;i=i+2) {  //1 3 5
		    	  for(int k=3;k>=i;k=k-2) {
		    		  System.out.print(' ');
		    	  }
		    	  for(int j=1;j<=i;j++) { 
		    		  System.out.print('*');
		    	  }System.out.println();
		      }
		      
		      for(int i=1;i<=a;i=i+2) { // 1 3 5 (ex)5를입력했을때
		    	  for(int k=1;k<=i;k=k+2) {
		    		  System.out.print(' ');
		    	  }
		    	  for(int j=a-2;j>=i;j--) { // 3=> 3 1 , 1
		    		  System.out.print('*');
		    	  }System.out.println();
		      }s.close();

	
	
	
	
	}	
}
