package part01.sec02.exam02;

class Parent3{
	
	int x=100;
	
    void method() {
    	System.out.println("Parent Method");
    }
}

class Child3 extends Parent3{
	
	int x=200;
	
	void method() {
		System.out.println("x="+x);// ����Ŭ������ �ʵ�����ν�
		System.out.println("super.x="+super.x);//super �θ�
		System.out.println("this.x="+this.x);//this ����
		System.out.println("------------------------");
	}
}

public class BindTest_9 {

	public static void main(String[] args) {
		Parent3 a =new Child3();
		a.method();
		
		Child3 b = new Child3();
		b.method();
		
		Parent3 c= new Parent3();
		c.method();
		

	}

}
