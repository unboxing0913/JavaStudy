package part01.sec01.exam01;

import java.util.Scanner;

public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		int a,b;
		 		  
		  while(true) {
			  System.out.print("���� ù��° �� �Է�:");
        	  a=s.nextInt();
        	  System.out.print("���� �ι�° �� �Է�:");
        	  b=s.nextInt();
        	  
        	  if(a==0||b==0) {
        		  break;  }
        	
        	  System.out.printf("%d + %d = %d\n",a,b,a+b);
        	  
	         }

		     System.out.println("0�� �Է��ؼ� �ݺ����� Ż�� �߽��ϴ�.");
		     s.close();

}
}