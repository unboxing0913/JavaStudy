package part01.sec02.exam01;

class Data1{
	int value;
	
	Data1(){
		
	}
	
}

class Data2{
	int value;
    Data2(){
    	
    }
	Data2(int x){
		value=x;
	} //객체 생성시 생성자가 하나라도 있으면 컴파일러는 기본생성자를 만들지 않는다
}

class Data3{ // 생성자가 주로하는일 => 초기화,객체 생성시 제일 먼저 실행
	int value; 
	Data3(int x){
		value=x;
		System.out.println(value); //생성자안에서 출력가능
	}
}

public class ConstructorTest_05 {

	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2(); // 기본생성자를 따로만들지않았을시 컴파일에러
		Data2 d3=new Data2(10);
		Data3 d4=new Data3(100);
		System.out.println(d4.value);

	}

}
