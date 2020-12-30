package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.printf("문자열 입력 ==> ");
		str = s.nextLine();
		System.out.printf("출력 문자열==> ");
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o') { // o는 문자 내부적으로 아스키코드 정수이기때문에 ==로 비교
				System.out.printf("%c",'$');
			}else {
				System.out.printf("%c",str.charAt(i));
			}
				
		}
		        System.out.println("\n입력된 문자열 :"+str);

		        s.close();
		        
	}

}

//문자열 입력 ==> Programming Java OK!!
//출력 문자열==> Pr$gramming Java OK!!          ==> o가 $로 바뀐것은아님 출력만 한것
//입력된 문자열 :Programming Java OK!!
