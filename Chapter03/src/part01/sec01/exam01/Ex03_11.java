package part01.sec01.exam01;

public class Ex03_11 {

	public static void main(String[] args) {
		
		//int a,b,c,d,e;
		
		//a='A'; // 65
		//System.out.printf("%c \t",a);
		//System.out.printf("%d \n",a);
		
		char a,b,c,d,e; //문자를저장하는 2byte 타입 (0~65535) 유니코드
		
		a='A'; // 65(A)
		System.out.printf("%c \t",a);
		//System.out.printf("%d \n",a); //오류나는이유는 들어있는값보다 타입먼저체크하기때문
		System.out.printf("%d \n",(int)a); // 타입변환후 int로 캐스팅하고 출력하면 아스키코드로 변환되는걸봄
		
		b='a'; // 97(a)
		//c=b+1; 타입이안맞음 char 타입으로 바꿔줘야함 이유가뭐지 1도설마 문자로바꾼느낌 a다음은b abcd알파벳순
		c=(char) (b+1);
		System.out.printf("%c \t",b);
		System.out.printf("%c \t\n",c);
		
		d=90; // Z(90) 숫자를 넣어도 문자로 출력 char
		System.out.printf("%c \t\n",d);//%c문자로 출력  아스키코드 90은 Z
		
		d='가';
		System.out.printf("%c \t",d);
	    e=(char) (d+1); // 가+1 ㄱ?
		System.out.printf("%c \t\n",e);
		
		
		System.out.printf("%d \t\n",(int)d); //유니코드 한글 십진수로 가=44032 각44033
		System.out.printf("%d \t\n",(int)e); //정수타입 맞춰주기 
	}

}
