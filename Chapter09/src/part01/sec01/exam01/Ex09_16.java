package part01.sec01.exam01;

public class Ex09_16 {
       
	static void func1() { //단순내용을 출력할때는 반환값이없는 void를 써주는게 좋음.
		System.out.printf("void형 메소드는 돌려줄게 없음.\n");
	}
	
	static int func2() {
		return 100;
	}
	
	public static void main(String[] args) {
		
		int a;
		func1(); // 그냥호출됨
		a = func2(); // 변수 받아서 호출해야함
		System.out.printf("int형 메소드에서 돌려준 값==>%d\n",a); // , func2() 직접 값줘도 출력됨
		
	

	}

}
