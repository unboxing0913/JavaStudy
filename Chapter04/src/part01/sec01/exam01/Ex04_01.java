package part01.sec01.exam01;
//연산자 수업
public class Ex04_01 {

	public static void main(String[] args) {
		int a,b=5,c=3;
		
		a=b+c;//a의 값을 정해야 출력이가능하기때문에 출력문 위쪽에쓴다
		System.out.printf("%d + %d=%d \n",b,c,a);
		
		a=b-c;
		System.out.printf("%d - %d=%d \n",b,c,a);
		
		a=b*c;
		System.out.printf("%d * %d=%d \n",b,c,a);
		
		a=b/c;
		System.out.printf("%d / %d=%d \n",b,c,a);
		
		a=b%c;//나머지연산자
		System.out.printf("%d %% %d=%d \n",b,c,a);
		
		// 연산에 관련된것 5가지

	}

}
