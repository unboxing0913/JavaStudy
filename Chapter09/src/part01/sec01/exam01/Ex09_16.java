package part01.sec01.exam01;

public class Ex09_16 {
       
	static void func1() { //�ܼ������� ����Ҷ��� ��ȯ���̾��� void�� ���ִ°� ����.
		System.out.printf("void�� �޼ҵ�� �����ٰ� ����.\n");
	}
	
	static int func2() {
		return 100;
	}
	
	public static void main(String[] args) {
		
		int a;
		func1(); // �׳�ȣ���
		a = func2(); // ���� �޾Ƽ� ȣ���ؾ���
		System.out.printf("int�� �޼ҵ忡�� ������ ��==>%d\n",a); // , func2() ���� ���൵ ��µ�
		
	

	}

}
