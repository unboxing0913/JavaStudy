package part01.sec01.exam01;

public class Ex02_01 {

	public static void main(String[] args) {
		int a; // 4byte 정수 변수선언
		int b; // 하나의 명령문이 끝나면 반드시 ; 찍는다(끝).
		int result;
		
		a=100;
		b=50;
		
		result=a+b; //150
        System.out.println(a+"+"+b+"="+result);//괄호안의내용출력
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result);//괄호안의내용출력
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);//괄호안의내용출력
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);//괄호안의내용출력
		
	}

}
