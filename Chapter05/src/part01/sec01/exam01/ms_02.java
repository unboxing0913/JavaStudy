package part01.sec01.exam01;

import java.util.Scanner;

public class ms_02 {
	
	public static void main(String[] args) {
			        	
	        Scanner s=new Scanner(System.in);
	    int a,b;
	   
	    System.out.print("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���.=>");
	    String str = s.nextLine();
	    a = Integer.parseInt(str);
	   // a = s.nextInt();	    
        System.out.printf("����� %d �Դϴ�.",a);
         
        b = (int)(Math.random()*3)+1;
        System.out.printf("���� %d �Դϴ�.",b);
	   
        switch(a-b) {
	    case 0:
	    	System.out.println("�����ϴ�.");
	    	break;
	    case 1:
	    	
	    case -2:
	    	System.out.println("�̰���ϴ�.");
	    	break;
	    case 2:
	    	
	    case -1:
	    	System.out.println("�����ϴ�.");
	    	break;
	   
	    default:
	    	System.out.println("�߸������ϼ̽��ϴ�.");
	    }
        s.close();
	}
}
