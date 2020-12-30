package part01.sec01.exam01;

import java.util.Scanner;

public class Ex05_09_01__ {

	public static void main(String[] args) {
		
//	    Scanner s=new Scanner(System.in);
//		char grade=s.next().charAt(0);//At(?)<-저장된공간의 순서 0부터시작~
//	     //next()는 문자열 string타입으로 읽음  	
//	    //next()로 문자열타입으로 읽은뒤 문자열타입의 맨앞 At(0) 으로 맨앞의 문자열을 그대로 출력
//	    switch(grade) {
//	    case 'A'://문자따옴표
//	    	//System.out.println("참 잘하였습니다.");
//	        //break;
//	    case 'B':
//	    	System.out.println("참 잘하였습니다.");
//	    	break;
//	    case 'C':
//	    	//System.out.println("좀 더 노력하세요.");
//	    	//break;
//	    case 'D':
//	    	System.out.println("좀 더 노력하세요.");
//	    	break;
//	    case 'F':
//	        System.out.println("다음 학기에 다시 수강하세요.");
//	        break;
//	    
//	    default:
//	    	System.out.println("잘못된 학점입니다.");
//	    }
//	    s.close();
		
		Scanner s=new Scanner(System.in);
		char sco=s.next().charAt(0); //char 문자 하나읽은땐 
		      // 스캐너 next string 으로받은 문자열을 charAf로 문자하나를 받아옴
		
		switch(sco) {
		case 'A': 
			System.out.println("참 잘햇습니다.");
			break;
		case 'B': 
			System.out.println("너무아쉽네요.");
			break;
		case 'C': 			
		case 'D': 
			System.out.println("좀더 노력하세요");
			break;
		case 'F': 
			System.out.println("다음학기에 재수강하세요.");
			break;
		default:	
			System.out.println("잘못된 값입니다.");
		}
		
		s.close();
		
		
		
	}
}
	


