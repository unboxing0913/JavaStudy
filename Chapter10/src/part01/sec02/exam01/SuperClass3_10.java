package part01.sec02.exam01;

public class SuperClass3_10 {
	final String name="gemini";  // final => 고정된값을가짐
	int age=10;
	
	public void printInfo() {
	
	System.out.println(name+":"+age);
	}
	
	public void changeValue() {
		// name="johnharu";      final 이붙으면 같은 필드에서도 수정이불가능
		age=20;
	}
	public static void main(String[] args) {
	   SuperClass3_10 sc3=new SuperClass3_10();
	   sc3.printInfo();
	   sc3.changeValue();
	   sc3.printInfo();

	}
	
}

