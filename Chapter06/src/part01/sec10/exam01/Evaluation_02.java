package part01.sec10.exam01;

import java.util.Scanner;

public class Evaluation_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int gcd;
		System.out.print("ù��° ���� �Է�:");
		int a = s.nextInt();
		System.out.print("�ι�° ���� �Է�:");
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
        		  //System.out.println("i����:"+i);
        		  
        	  }
        	}
        	
          }System.out.println("�ִ�������:"+gcd);
	          s.close();
}
}