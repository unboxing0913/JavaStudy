package part01.sec02.exam02;

class A5{
	   
	int x = 100;
	public void aaa() { 
		
	}
	
}

class B5 extends A5{
	int y = 200;
	public void aaa() { // 오버라이딩
		System.out.println("y="+y);
	}
}

public class Round13_Ex09_4 {

	public static void main(String[] args) {
		A5 ap=new B5();
		
		System.out.println("x="+ap.x);
		//System.out.println("y="+ap.y);
		ap.aaa(); // 직접접근이 안되기때문에 간접접근으로 하는방법
	}

}
