package part01.sec01.exam01;



public class Ex05_09_01 {

	public static void main(String[] args) {
		// A,B학점 :"참 잘하였습니다."
		// C,D학점 :"좀 더 노력하세요."
		// F 학점 :"다음 학기에 다시 수강 하세요"
		// 그외 :"잘못된 학점입니다."
			    
	    
	    char grade='C';//문자따옴표
	    
	    switch(grade) {
	    case 'A'://문자따옴표
	    	//System.out.println("참 잘하였습니다.");
	        //break;
	    case 'B':
	    	System.out.println("참 잘하였습니다.");
	    	break;
	    case 'C':
	    	//System.out.println("좀 더 노력하세요.");
	    	//break;
	    case 'D':
	    	System.out.println("좀 더 노력하세요.");
	    	break;
	    case 'F':
	        System.out.println("다음 학기에 다시 수강하세요.");
	        break;
	    
	    default:
	    	System.out.println("잘못된 학점입니다.");
	    }
	}
}
	


