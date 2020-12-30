package part01.sec01.exam01;

public class Ex03_05 {

	public static void main(String[] args) {
		
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123);//5는전체자리수
		System.out.printf("%05d\n",123);//05는 빈자리0으로
		
		System.out.printf("%f\n", 123.45);//실수출력f
		System.out.printf("%7.1f\n", 123.45);//소수점한자리출력(반올림)
		System.out.printf("%7.3f\n", 123.45);//소수점세자리출력(반올림)
		
		System.out.printf("%s\n", "Hi~Java");
		System.out.printf("%10s\n", "Hi~Java");// 10공백
		

	}

}
