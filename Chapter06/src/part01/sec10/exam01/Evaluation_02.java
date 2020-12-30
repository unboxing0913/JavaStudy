package part01.sec10.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int gcd;
		System.out.print("첫번째 수를 입력:");
		int a = s.nextInt();
		System.out.print("두번째 수를 입력:");
        int b = s.nextInt();
        
        if(b>a) {
        	int imsi = a;
        	a=b;
        	b=imsi;
        }
        gcd = 0;
       
        for(int i=1;i<=a;i++) {
        	if(a%i==0) {
        	  if(b%i==0) {
        		  gcd = i;
        		  //System.out.println("i값은:"+i);
        		  
        	  }
        	}
        	
          }System.out.println("최대공약수는:"+gcd);
	          s.close();
}
}