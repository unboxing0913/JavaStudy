package part01.sec01.exam01;

class Car2{
	
	Car2(){
		System.out.println("슈퍼 클래스 생성자 호출"); }
}

class Sedan2 extends Car2{
	
	Sedan2(){
		System.out.println("서브 클래스의 생성자 호출");
	}
	
} 
//★중요!!!  실행순서 중요함 (부모클래스가존재하지않으면 자식클래스가 존재하지않기때문에 부모클래스가먼저)

public class Ex11_02 {

	public static void main(String[] args) {  
		Sedan2 sedan2=new Sedan2(); //상속받았기때문에 자식클래스를 객체생성해도 부모클래스 생성자까지 실행된다.
		//Car2 sedan2=new Car2(); //상속관계에서 부모객체만 생성햇을땐 자식객체가 실행안됨
	}

}
