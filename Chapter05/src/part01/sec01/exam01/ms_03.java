package part01.sec01.exam01;

import java.util.Scanner;

public class ms_03 {

	public static void main(String[] args) {
  
		
		Scanner s=new Scanner(System.in);
		
	    System.out.print("당신의 주민등록번호를 입력하세요.(ex123456-1111111)=>");
	    
	   //String str ="";
	   //char gender=' ';
	    
	    String str = s.nextLine();
	    char gender = str.charAt(7);
	    
	    
	    
	    
	    switch(gender) {
	    case '1':
	    case '3':
	    	System.out.println("당신은 남자입니다.");
	    	break;
	    case '2':
	    case '4':
	    	System.out.println("당신은 여자입니다.");
	    	break;
	    default:
	    	System.out.println("잘못 입력하셨습니다.");
	    	
	    }
	    s.close();
	}

}
