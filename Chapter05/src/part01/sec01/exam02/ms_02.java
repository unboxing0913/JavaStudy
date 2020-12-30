package part01.sec01.exam02;

import java.io.IOException;

public class ms_02 {

	public static void main(String[] args)throws IOException {
	
		 
		 
		 System.out.print("임의의 문자 한개를 입력하세요 : ");
		 char a = (char) System.in.read();
		 
		 System.in.skip(2);
		 
		 System.out.print("임의의 문자 한개를 입력하세요 : ");
		 char b = (char) System.in.read();
		 
		
		 
		 if(a>b) {
			 System.out.println("첫번째 입력하신 문자의 아스키코드값이 더 큽니다.");
		 }else if(a<b) {				 			 
				 System.out.println("두번째 입력하신 문자의 아스키코드값이 더 큽니다.");
			 }else {
				 System.out.println("입력하신 문자의 아스키코드값이 같습니다.");
			 }
		 
	}

}
