package part01.sec01.exam05;

class Parent{
	int x=10;
	
}

class Child extends Parent{
	
  void method() {
	  System.out.println("x="+x);
	  System.out.println("this.x="+this.x);
	  System.out.println("super.x="+super.x);
  }
	
}
public class SuperTest_3 {

	public static void main(String[] args) {
		Child c=new Child();
		c.method();
	}

}
