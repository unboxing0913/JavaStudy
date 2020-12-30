package part01.sec01.exam01;

public class Ex03_12 {

	public static void main(String[] args) {
	  int a,b; //4byte 크기
	 char c,d; //2byte 크기
	 
	 a=0xF90A;                                                //진법변환 (2나눔) ㄴ 거꾸로
	 b=0x50; //10진수 80
	 System.out.printf("%c \n", a); //16진수 문자출력 가능 printf <-형식출력
	 
	 //c=b; // b는 int타입 c는char타입 대입불가
	 
	
	 c=(char)b;  // 변수선언한 크기는 절대 변하지 않는다.(임의로 값만 사용한다보면됨)  
                  //2byte짜리 b 변한것은아님 하지만 2byte이상 b가 크다면 에러
	 System.out.printf("%c %d\n", c,(int)c);
	              //문자타입   //10진수
	 
	 
	 d='#';
	 System.out.printf("%c의 ASCII값은 %d입니다\n", d,(int)d); 
	                // %c(문자)의 ASCII값은 %d(정수)입니다 라는출력
	 
	
	 
	}

	//char a; main밖에있는것은 무효처리 [이걸선언했을때 밑에것들 보기]
	//a='Ab'; error // 문자열(문자2개이상)은 큰따옴표  작은따옴표때문에 에러
	//a="A"; error // 하나여도 문자열이맞지만 타입때문에 에러 ==> a="A"문자열  문자열은 String  
	//a="Ab"; error // 문자열은맞지만 저장하는변수가 틀림 ==> 이하동문
	//a='A'; //가능함
}
