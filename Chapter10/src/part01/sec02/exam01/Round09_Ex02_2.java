package part01.sec02.exam01;

public class Round09_Ex02_2 {
	int a; //필드
	int b;
	double c;
	

	public static void main(String[] args) {
		Round09_Ex02_2 kor1 = null;   // 필드를사용하기위해서 생성
		kor1= new Round09_Ex02_2();  
		
		kor1.a=100;    //접근
		kor1.b=200;
		kor1.c=300.0;
		
		System.out.println("a="+kor1.a);
		System.out.println("b="+kor1.b);
		System.out.println("c="+kor1.c);

	}

}
