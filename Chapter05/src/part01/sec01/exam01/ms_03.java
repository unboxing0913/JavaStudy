package part01.sec01.exam01;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
  
		
		Scanner s=new Scanner(System.in);
		
	    System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���.(ex123456-1111111)=>");
	    
	   //String str ="";
	   //char gender=' ';
	    
	    String str = s.nextLine();
	    char gender = str.charAt(7);
	    
	    
	    
	    
	    switch(gender) {
	    case '1':
	    case '3':
	    	System.out.println("����� �����Դϴ�.");
	    	break;
	    case '2':
	    case '4':
	    	System.out.println("����� �����Դϴ�.");
	    	break;
	    default:
	    	System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	    	
	    }
	    s.close();
	}

}
