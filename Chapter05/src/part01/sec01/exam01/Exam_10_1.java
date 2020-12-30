package part01.sec01.exam01;

import java.util.Scanner;

public class Exam_10_1 {

	public static void main(String[] args) {
//		char grade;
//		Scanner s=new Scanner(System.in);
//		
//		int score=s.nextInt();
//		
//		switch(score/10) { //나눠서 몫으로 ex)100/10=10 ,95/10=9.~~~~~ 
//		case 10:
//		case 9:
//		 grade='A'; // 문자 = 'A'
//		 //System.out.println("학점은"+grade+"입니다"); 반복이니깐 switch 밖에서 한번에처리
//		 break;
//		case 8:
//		 grade='B';
//		 //System.out.println("학점은"+grade+"입니다");
//		 break;
//		case 7:
//	     grade='C';
//	    //System.out.println("학점은"+grade+"입니다");
//	     break;
//		case 6:
//		 grade='D';
//		//System.out.println("학점은"+grade+"입니다");
//		 break;
//		 
//		default:
//		 grade='F';
//		 //System.out.println("학점은"+grade+"입니다");
//		 		
//		}
//		System.out.println("학점은"+grade+"입니다");
//		s.close();
		
		Scanner s=new Scanner(System.in);
		int a =s.nextInt();
		
		switch(a/10) {
		
		case 10:
		case 9:
		System.out.println("학점은 A입니다.");
		break;
		case 8:
		case 7:
		System.out.println("학점은 B입니다.");
		break;
		case 6:
		case 5:
		System.out.println("학점은 C입니다.");
		break;
		case 4:
		System.out.println("학점은 D입니다.");
		break;
		case 3:
		System.out.println("학점은 F입니다.");
		break;
		default:
		System.out.println("재수강");
		
	}
		s.close();
		
	}

}
