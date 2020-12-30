package part01.sec01.exam01;

import java.util.Scanner;

public class proplem05_05 {

	public static void main(String[] args) {
		
		char gender=' ';  // char 타입은 '' 안에 공백을하나 줘야 에러가안남.
		String regNo=""; // 이거 초기화시킨거임
		
		System.out.print("당신의 주민등록번호를 입력하세요.(123456-1111111=>");
			
		Scanner s=new Scanner(System.in);	//	
		regNo=s.nextLine();//
		gender = regNo.charAt(7);//

		
//		regNo = s.nextLine(); // 문자열 입력받을때
//		regNo = 
//		gender = Integer.parseInt(regNo);
//		
		
		
		switch(gender) {
		

		case '1'://
		case '3'://
			System.out.println("당신은 남자 입니다.");
            break;
		case '2'://
		case '4'://
			System.out.println("당신은 여자 입니다.");
            break;
		
		default:
			System.out.println("유효하지 않은 주민등록번호 입니다.");
		}
		s.close();
	}

}
