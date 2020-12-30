package part01.sec01.exam01;

// 주소(또는 참조)의 전달-call by address(reference)
       //클래스는 항상 첫글자대문자로 (관례)
class MyInt{ // 클래스안에서 선언된 변수들은 메소드안에 선언된변수랑 개념자체가다름.
	int a; //default 값을 0가지고있음
	//sysout 출력안됨
}

public class Ex09_18 { //같은이유 찾아보면됨
	
	public static void func1(MyInt m) { //int:자료형(타입)
		m.a=m.a+1;                                //MyInt 클래스(내가직접만든) 타입 (안에 int a)
		System.out.printf("전달받은 a==>%d\n",m.a);
	}

	public static void main(String[] args) {//클래스가 여러개있을땐 유일하게 main이 들어간 클래스만 파일이름으로 할수있고 public 을 붙일수가있음
		//int a;
		//System.out.println(a); 지역변수는 초기화해줘야 사용할수있음
        MyInt m=new MyInt(); //대입연산자(클래스) : 변수=(주소)값                     
         //=>클래스 만드는법
        m.a=10;
        func1(m); // 주소가넘어감 call by address(reference)
        System.out.printf("func1()실행 후의 a==>%d\n",m.a);
        
	}

}      //.<= 접근연산자
