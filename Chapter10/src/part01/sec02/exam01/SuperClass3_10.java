package part01.sec02.exam01;

public class SuperClass3_10 {
	final String name="gemini";  // final => �����Ȱ�������
	int age=10;
	
	public void printInfo() {
	
	System.out.println(name+":"+age);
	}
	
	public void changeValue() {
		// name="johnharu";      final �̺����� ���� �ʵ忡���� �����̺Ұ���
		age=20;
	}
	public static void main(String[] args) {
	   SuperClass3_10 sc3=new SuperClass3_10();
	   sc3.printInfo();
	   sc3.changeValue();
	   sc3.printInfo();

	}
	
}

