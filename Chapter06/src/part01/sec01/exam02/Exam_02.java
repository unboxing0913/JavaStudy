package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int su1,su2;
		int gcd;
		int i;
		
		System.out.print("첫번째 수를 입력:");
		su1=s.nextInt();
		System.out.print("두번째 수를 입력:");
		su2=s.nextInt();
		
		if(su2<su1) {
			int imsi=su1;			
			su1=su2;
			su2=imsi;
		}
		
		// 최대 공약수(greatest common divisor:GCD);
        gcd=1;
        
        
        for(i=2;i<=su1;i++) {
        	if(su1%i==0) {
        		if(su2%i==0) {
        			gcd = i;
        			//System.out.println("i="+i);  
        		}
        	}   //System.out.println("i="+i);   		
        	  s.close();
        	}
        	System.out.println("최대공약수는:"+gcd);

        
        
      //  System.out.println("최대공약수는:"+gcd);
      
        
	}

}
