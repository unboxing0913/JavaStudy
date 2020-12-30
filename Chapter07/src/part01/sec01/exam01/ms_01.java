package part01.sec01.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  int start,end;
		  int basu;
		  int hap=0;
		  int i;
		  
		  			  
		  System.out.print("합계의 시작값==>"); //처음값 ==>이 값이 증가하면서 나눴을때 배수가되는걸 찾는게목표
		  start = s.nextInt();
		  
		  System.out.print("합계의 끝값==>"); // 여기까지 가는값 (목표값)
		  end= s.nextInt();
		  
		  System.out.print("배수==>");
		  basu= s.nextInt();
				
		  i=start;//생각해보면 i는 start값 
		  
		  while(i<=end) {
			   // end까지 증가			 
			  i++;	  
			  if(i%basu==0) 
				  hap=start+i;				
			  
				  			 			  
			  
		  }  System.out.printf("%d부터 %d까지의 %d배수의 합계==>%d\n",start,end,basu,hap);
		      s.close();
			  
		  
	}

}
