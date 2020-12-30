package part01.sec01.exam05;

class Parent2{
	int x=10;
	
}

class Child2 extends Parent{
  int x=20;	 
  //int b=20; //참고용 부모한테 b는없음
  void method() {
	  System.out.println("x="+x);
	  System.out.println("this.x="+this.x);
	  System.out.println("super.x="+super.x);
  }
	
}

public class SuperTest_4 {

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.method();

	}

}
