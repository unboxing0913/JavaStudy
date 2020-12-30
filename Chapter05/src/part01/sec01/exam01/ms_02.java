package part01.sec01.exam01;

import java.util.Scanner;

public class ms_02 {
	
	public static void main(String[] args) {
			        	
	        Scanner s=new Scanner(System.in);
	    int a,b;
	   
	    System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요.=>");
	    String str = s.nextLine();
	    a = Integer.parseInt(str);
	   // a = s.nextInt();	    
        System.out.printf("당신은 %d 입니다.",a);
         
        b = (int)(Math.random()*3)+1;
        System.out.printf("컴은 %d 입니다.",b);
	   
        switch(a-b) {
	    case 0:
	    	System.out.println("비겼습니다.");
	    	break;
	    case 1:
	    	
	    case -2:
	    	System.out.println("이겼습니다.");
	    	break;
	    case 2:
	    	
	    case -1:
	    	System.out.println("졌습니다.");
	    	break;
	   
	    default:
	    	System.out.println("잘못선택하셨습니다.");
	    }
        s.close();
	}
}
