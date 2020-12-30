package part01.sec01.exam01;

public class 연습 {

	public static void main(String[] args) {
		int intValue = 'A';
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		int a;
		
		a=100;
		a=a+200;
		a=a+600;
		a=100;
		
		System.out.print(a);
		System.out.println("\n");
		
		
		boolean stop = true;
		if(stop) {
		 System.out.println("true는첫번째");
		} else {
			System.out.println("false은 두번째");
		}
		
		boolean stopp = false;
		if(stopp) {
		 System.out.println("true는첫번째");
		} else {
			System.out.println("false은 두번째"); // boolean 응용하는법 알아보기
		}
		
		
	}

}
