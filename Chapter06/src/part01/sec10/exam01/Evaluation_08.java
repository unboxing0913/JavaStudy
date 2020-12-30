package part01.sec10.exam01;

public class Evaluation_08 {

	public static void main(String[] args) {
		 int cnt=0 ;
		 ///////////////////////////////////////////////////////////////
		 for(int i=1;i<=3;i++) {
			 for(int j=1;j<=4;j++) {
				 cnt++;
			 }
		 }
		 System.out.println("방법의 개수는 = "+cnt); 
		 System.out.println("================ ");
		/////////////////////////////////////////////////////////////// 
		 for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				 System.out.print('★');
			 }System.out.println();
			  
		 }System.out.println("=====================");
		 
		 /////////////////////////////////////////////////////////////
		 
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<8;j++) {
				 System.out.print('★');
			 }System.out.println();
		 }System.out.println("====================");
		 
		 ///////////////////////////////////////////////////////////////
		 
		 for(int i=0;i<9;i++) {
			 for(int j=0;j<8;j++) {
				 System.out.print('★');
			 }System.out.println();
		 }System.out.println("==================================");
		 ////////////////////////////////////////////////////////////
		 for(int i=0;i<9;i++) {
			 for(int j=2;j<10;j++) {
				 System.out.print(j+"*");
			 }System.out.println();
		 }System.out.println("================================");
		 ///////////////////////////////////////////////////////////
		 
		 for(int i=1;i<9;i++) {
			 for(int j=2;j<10;j++) {
				 System.out.print(j+"*"+i+"\t");
			 }System.out.println();
		 }System.out.println("=================================");
		 ///////////////////////////////////////////////////////////
		 for(int i=1;i<10;i++) {
			 for(int j=2;j<10;j++) {
				 System.out.print(j+"*"+i+"="+(j*i)+"\t");
			 }System.out.println();
		 }System.out.println("=================================");
		 ////////////////////////////////////////////////////////////
		 for(int i=1;i<6;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print('★');
			 } System.out.println();
		 }System.out.println("=====================================");
	    ///////////////////////////////////////////////////////////////
		 for(int i=1;i<=5;i++) {//12345
			 for(int j=1;j<=5-i;j++) {
				 System.out.print('☆');
			 }for(int k=1;k<=i;k++) {
				 System.out.print('★');
		 }System.out.println();
		 
		 
		
	     }System.out.println("=====================================");
        /////////////////////////////////////////////////////////////////
          for(int i=1;i<=5;i++) {
        	  for(int j=1;j<=5;j++) {
        		  if(i+j>=6) {
        			  System.out.print('★');
        	  }else {System.out.print('☆');
          }
        	  
          }System.out.println();
          }System.out.println("===========================================");
         
	
	
	
	}	
}
