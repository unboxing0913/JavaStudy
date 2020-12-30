package part01.sec01.exam02;

import java.io.IOException;

public class Exam_12__ {

	public static void main(String[] args) throws IOException {//read 쓸때필요
		                                   //이 위에껀 나중에따로배울것(add throws ~~~) 
		                                          
		System.out.print("임의의 문자한개를 입력하세요 : ");
		char ch=(char)System.in.read();//read는 문자하나를 인트타입으로 읽는것 ( a -> 97로 )
		         // 캐스팅하는이유는 내가 인트타입말고 문자타입이 필요하기때문	
		System.in.skip(2);//(2)<-2개를스킵 LF , CR
		//갯수 //아스키코드 (LF+CR) Enter역활  read 쓸땐 엔터키 자체를 인식함 	
		System.out.print("임의의 문자한개를 입력하세요 : ");
		char ch2=(char)System.in.read();
			
		
		if (ch>ch2) {
			System.out.println("첫번째 입력하신 문자의 아스키코드값이 더 큽니다.");
		}if(ch<ch2) {
			System.out.println("두번째 입력하신 문자의 아스키코드값이 더 큽니다.");
		}else {
			System.out.println("입력하신 두 문자는 같은 문자 입니다.");
		}
		
	
		
	}

}
