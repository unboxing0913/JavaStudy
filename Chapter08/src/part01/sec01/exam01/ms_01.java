package part01.sec01.exam01;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		
		int su[]=new int[5];
		int max=0;
		int i;
		for(i=0;i<5;i++) {
		    su[i] = s.nextInt();
		     //ex) 20 30 40 15 10
		  if(su[i]>max) {
			  max=su[i];   //    su[0]  , su[1] ,      su[2] ,     su[3]  ,  su[4]
			               //ex)i(0)<(20) i(20)<(30) i(30)<(40) i(40)>(15) i(40)>10  
			
	 	 }
	 }
		  System.out.printf("입력된 수에서 가장 큰수는 %d입니다.\n",max);
           s.close();
	}

}
