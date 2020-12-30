package part01.sec01.exam01;

import java.util.Scanner;

public class Problem05_04 {

	public static void main(String[] args) {
		int user,com;
		Scanner s=new Scanner(System.in);
		
		
		System.out.print("가위(1),바위(2),보(3)중 하나를 입력하세요. =>");
		
	    String tmp=s.nextLine(); //문자열 읽어옴
	    
	    user = Integer.parseInt(tmp); //( )있는것을 숫자로바꿈.
	    //com = Math.random() //난수 발생(=0~0.99999999~~~) ==> 1이안됨(0<=난수<1)
	    //Math <-수학에관련된 클래스 random <-말그대로 랜덤
	    // (0.9999*3 = 2.99997) ==>3이안나옴
	    com = (int)(Math.random()*3)+1; 
	       //소수.00으로변할수있도록 int정수변환 0,1,2 난수는 3을곱해서 3이안나오기때문에 +1 더해줌
	    System.out.println("당신은"+user+"입니다.");
	    System.out.println("컴은"+com+"입니다.");
	    
	    switch(user-com) {
	    case 0:
	    	System.out.println("비겼습니다.");
	    	break;
	    case 1:
	    case 2:
	    	System.out.println("이겼습니다.");
	    	break;
	    case -1:
	    case -2:
	    	System.out.println("졌습니다.");
	    	break;
	    default:
	    	    }
	    	
 s.close();
//	    if(user>com) {
//	    System.out.println("이겼습니다.");
//	    }else if(user<com) {
//	    System.out.println("졌습니다.");
//	    }else {
//	    System.out.println("비겼습니다.");	
//	    }  //이거 9개나필요함 숫자랑 문자랑다르게 인식함 if문으로 짜려면 논리연산자를 사용 
	}
	}  



	    	   
	    
	    
	    
	    
	    
	    
   
	      

	


