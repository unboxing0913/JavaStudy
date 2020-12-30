package part01.sec02.exam02;

class Parent{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x=200;
	void method() { // 오버라이딩
		System.out.println("Child Method");
	}
}

public class BindingTest_7 {

	public static void main(String[] args) {
		Parent p = new Child();//다형성 적용		
		System.out.println("p.x="+p.x);
		p.method();
		
		Child c = new Child();
		System.out.println("c.x="+c.x);
		c.method();
		
		
		
	}

}


/*
 * p.x=100
 * Child Method
 * c.x=200
 * Child Method
 * 
 */

