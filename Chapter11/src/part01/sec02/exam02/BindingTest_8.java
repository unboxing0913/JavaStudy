package part01.sec02.exam02;


class Parent2{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2{

	}



public class BindingTest_8 {

	public static void main(String[] args) {
		Parent2 p = new Child2();		
		System.out.println("p.x="+p.x);
		p.method();
		
		Child2 c = new Child2(); //아무것도안했을경우 다형성이라해도 상속관계이기때문에 부모클래스 실행\
		System.out.println("c.x="+c.x);
		c.method();

	}

}
