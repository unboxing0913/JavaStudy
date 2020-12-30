package part01.sec02.exam08;

class HundredNumbers{
	static int arr[];
	
		//정적 초기화 블록	
		//정적 필드는 특정 개체에 속하지 않기 때문에 생성자에서 초기값을 대입하면 안된다.
	
	static {
		arr = new int [100];
		for(int i=0; i<100; i++) {
			arr[i] = i;
		}
	}
}
public class StaticInitializerExample1_2 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
		
	}

}
