package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str,strRep,strSub,strAry[];
		
		System.out.print("문자열을 입력하세요:");
		str=s.nextLine();
		
		strRep=str.replace(" ","$");
		strSub=str.substring(3,8); // 3시작위치 8의 마지막숫자보다하나적게끔 출력됨 (0부터시작) // 문자열 start 위치부터 end전까지 문자열 자르기
		strAry=str.split(" ");     
		
		System.out.println("입력 문자열 출력 == >"+str);
		System.out.println("바꾼 문자열==>"+strRep);
		System.out.println("일부 문자열==>"+strSub);
	
	    for(int i=0;i<strAry.length;i++) {
	    	System.out.println("분리한 문자열"+i+"==>"+strAry[i]);
	    }
	
              s.close();		
		
	}

}

// replace 함수는 자신이 바꾸고싶은 문자로 문자열을 치환시켜주는 기능을 합니다 : 문자열 치환함수 repalce(기존문자,바꿀문자)
// str.substring(시작 인덱스, 종료 인덱스) = str 문자열의 시작인덱스 부터 종료 인덱스전까지 자른다.
// split(문자열) => 지정한 ()문자로 문자열을 나눌수있다 (배열)


