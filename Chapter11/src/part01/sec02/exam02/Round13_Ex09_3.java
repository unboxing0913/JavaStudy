package part01.sec02.exam02;

class A4{
	int x=10;
	
}

class B4 extends A4{
	int y=200;
}

public class Round13_Ex09_3 {

	public static void main(String[] args) {	 
		 /*
		 B4 ap=new B4();
		 
		 System.out.println("x="+ap.x); // 부모의 x를 가져옴
		 System.out.println("x="+ap.y);
		 */
         
		 /*
		 A4 ap=new A4();
		 
		 System.out.println("x="+ap.x);
		 System.out.println("x="+ap.y);  //컴파일 에러 A4는 부모객체기때문에 y값이없음 
         */
		
		 A4 ap=new B4();//다형성(다형성일 때 무조건 부모 위주로 처리한다,단 자식이 오버라이eld 했다면 자식에서 처리★★★★중요
		 
		 System.out.println("x="+ap.x);
		 // System.out.println("x="+ap.y); 부모위주로 처리되기때문에 y객체가없기때문에 에러
		 
		 
	}

}
