package part01.sec02.exam02;

class A6{
	int x=100;
	
}

class B6 extends A6{
	int x=200;
}

public class Round13_Ex10_5 {

	public static void main(String[] args) {
		A6 ap=new B6();
		
		System.out.println("x="+ap.x); //부모것 우선 

	}

}
