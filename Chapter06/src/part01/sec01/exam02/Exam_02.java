package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int su1,su2;
		int gcd;
		int i;
		
		System.out.print("ù��° ���� �Է�:");
		su1=s.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		su2=s.nextInt();
		
		if(su2<su1) {
			int imsi=su1;			
			su1=su2;
			su2=imsi;
		}
		
		// �ִ� �����(greatest common divisor:GCD);
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
        	System.out.println("�ִ�������:"+gcd);

        
        
      //  System.out.println("�ִ�������:"+gcd);
      
        
	}

}
