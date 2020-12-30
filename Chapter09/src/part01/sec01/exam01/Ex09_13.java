package part01.sec01.exam01;

public class Ex09_13 {

	public static void main(String[] args) {
		int hap;
		hap=plus(100,200);
		System.out.printf("100과 200의 plus()메서드 결과는:%d\n",hap);
		
	}
	
	public static int plus(int a,int b) { //plus(100,200) <=== result = a+b
		
		return a+b;
		//int result;
		//result=a+b;       : 이 방식도 됨.
		//return result;
		
	}

}
