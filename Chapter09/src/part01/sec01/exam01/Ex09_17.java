package part01.sec01.exam01;

public class Ex09_17 {

	// 값의 전달(call by value)-값 자체를 메소드에 넘겨주는 방법  
	
	static void func1(int a){
		a=a+1;
		System.out.printf("전달받은 a==>%d\n",a); //11
	}
	
	
	
	public static void main(String[] args) {
	    int a=10;
	    func1(a); //call by value : 값을 위의 func1 메소드에 넘겨줌
	   
	    System.out.printf("func1()실행 후의 a==>%d\n",a); //10

	}
              
}
