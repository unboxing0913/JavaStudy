package part01.sec02.exam08;

class HundredNumbers{
	static int arr[];
	
		//���� �ʱ�ȭ ���	
		//���� �ʵ�� Ư�� ��ü�� ������ �ʱ� ������ �����ڿ��� �ʱⰪ�� �����ϸ� �ȵȴ�.
	
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
