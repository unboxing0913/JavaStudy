package part01.sec01.exam01;

public class Ex04_04 {

	public static void main(String[] args) {
		int a=10,b;
		
		b=a++;//a가 단독으로 있을땐 상관없음 어딘가에 대입됬을때의 차이
		      //a변수를 중심으로 뒤 (후위 연산자)
		System.out.printf("%d\n",b);
		System.out.println(a); //a++가 어딘가에 대입되어있을땐 대입한 이후의 a의값이증가
		                           // 대입이후의 증가
		
		
		
		
		b=++a;//a변수를 중심으로 앞 (전위 연산자)
		      //먼저 증가를시키고 대입 (a++와 반대)

		System.out.printf("%d\n",b);
		System.out.println(a);
	

	}

}
