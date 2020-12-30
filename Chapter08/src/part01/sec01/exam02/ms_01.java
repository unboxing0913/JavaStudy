package part01.sec01.exam02;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		int su[]=new int[5];
		int i;
		int hap=0;
		
		for(i=0;i<5;i++) {
			
		System.out.printf("%d번째 수를 입력:",i+1);
		   su[i] = s.nextInt();
		   hap+=su[i];
		}
		
		
		for(i=0;i<5;i++) {					
			System.out.printf("%d,",su[i]);
		}
		
		
		
            System.out.print("합계 :"+hap);
	       
            s.close();
	}

}
