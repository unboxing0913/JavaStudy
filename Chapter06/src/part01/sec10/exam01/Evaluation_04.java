package part01.sec10.exam01;

public class Evaluation_04 {

	public static void main(String[] args) {
		
	      int i,j;
	      
	      for(i=2;i<=9;i++) {
	    	  System.out.printf("#제%d단#\t\t",i);
	      }
	        System.out.println();// for문이 참이아닐때 이 명령문을실행
			System.out.println(); 
	      
	      for(i=1;i<=9;i++) {//123456789	    	  
	    	  for(j=2;j<=9;j++) {//23456789
	    		  
	    		
	    		System.out.printf("%d X %d = %d\t",j,i,j*i);
	    	  } System.out.println();
	      }

	      
	      
}

}
