package part01.sec01.exam01;

public class Ex03_07 {

	public static void main(String[] args) {
		int a; // 정수형 변수(4byte)
		double b; // 실수형 변수(8byte),float타입은 (4byte)
		
		a=(int) 123.45; // 타입안맞을때 마우스올리면 casting후 타입일치한뒤 저장 소수점짤림	[소수점인데 Int안주면오류뜸]
		System.out.printf("a의 값 ==> %d\n",a);//java는 타입이 일치해야 실행가능
		
		b=200;//오류안나는이유가 실수가정수보다 크기때문 큰쪽에서 작은쪽X
		System.out.printf("b의 값 ==> %f\n",b);

	}

}
