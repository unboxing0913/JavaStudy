package part01.sec01.exam02;

public class Exam_03 {

	public static void main(String[] args) {
		int n = 5;
		int sum = hap(n);
		System.out.println("1~5까지의 합: " + sum);

	}

	public static int hap(int n) {
//		int gg = 0;
//		for (int i = 1; i <= n; i++) {
//			gg += i;
//		}
//		return gg;
		
		if(n==1) {                       //재귀호출 예제
			return 1;
		     }
		int tot=n+hap(n-1); //hap(n-1) 메소드안에서 자기자신 호출 (그림그려보면이해감 새로운 메소드가있다생각하고 그리기) 리턴리턴리턴리턴리턴
		return tot;

	}

}
