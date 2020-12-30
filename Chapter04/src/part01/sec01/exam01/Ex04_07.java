package part01.sec01.exam01;

public class Ex04_07 {

	public static void main(String[] args) {
		int num1=100,num2=-200;
		//boolean자체에는 참,거짓 값 두개만 
		boolean a=(num1 != 0); // true
		boolean b=(num2 != 0); // true
		
		System.out.println("상수의 AND 연산:"+(a&&b));//+는 연결식
		System.out.printf("상수의 OR 연산:%s\n",a||b);//형식지정 불리언타입 %s
		System.out.printf("상수의 NOT연산:%s \n",!a);

		//논리 연산자 중요
	}

}
