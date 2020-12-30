package part01.sec01.exam01;

public class Ex09_15 {//클래스의 범위를 잘이해
     //클래스안에선언된 전역변수 필드는 배열과같은개념 초기값0
	static int a=100;//전역변수(필드)
    
	static void func1() {                 //변수가 겹치는경우 지역변수가 우선!
		int a=200;//메소드안에 선언 : 지역변수
		System.out.printf("func1()에서 a의 값==>%d\n",a);//지역변수 a 값 200
	}
	
	public static void main(String[] args) {
		        // int a = 300; => 무조건 지역변수우선
                func1();//지워진것 
                System.out.printf("main()에서 a의 값==>%d\n",a);
		
		
	}
        //static 붙은애들은 메모리에 무조건먼저만들어짐.
}
