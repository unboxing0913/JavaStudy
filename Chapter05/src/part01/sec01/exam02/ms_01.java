package part01.sec01.exam02;

import java.util.Scanner;

public class ms_01 {

	public static void main(String[] args) {
		
	     Scanner s = new Scanner(System.in);
	     
	     System.out.print("ù��° ���� �Է�: ");
	     int a =s.nextInt();
	     
	     System.out.print("�ι�° ���� �Է�: ");
	     int b =s.nextInt();
	     
	     System.out.print("����° ���� �Է�: ");
	     int c =s.nextInt();
	    
	     //123,132,213,231,321,312
	     
	     if(c>=a && c>=b) {
	    	 int imsi = a;
	    	 a=c;
	    	 c=imsi;
	    	    if(c>=b) {
	    	            imsi = b;
	    	    		b=c;
	    	    		c=imsi;
	    	 
	            }
	     }else if(b>=a && b>=c) {
	             int imsi = a;
	                 a=b;
	                 b=imsi;
	            if(b <=c) {
	            	imsi = b;
	            	b=c;
	            	c=imsi;
	            }
	            }else if(c>=b) {
		    		 int imsi = b;
		    		 b=c;
		    		 c=imsi;
	            }
	     
	       System.out.printf("%d>=%d>=%d",a,b,c);
           s.close();
	}

}
