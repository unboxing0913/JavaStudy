package part01.sec01.exam01;
                                          
class Car{ //!!클래스(설계도)
	String color;     // !!필드(속성)
	int speed;
	
	void upSpeed(int value) { //!! 메소드(기능)
		speed+=value;  // 필드(속성)에있는 변수값 speed을 메소드(기능)에 줌 필드와 메소드의 변수를 하나로 묶어서 사용할수있게끔
	}
	void downSpeed(int value) {
		speed-=value;
	}
}

public class Ex10_01 { // . <- 으로 접근
    
	public static void main(String[] args) {
	
		Car myCar1= new Car(); // 객체생성 (설계도 쓰기위해) 클래스타입 Car       // myCar1(주소참조):참조변수
		myCar1.color="빨강";
		myCar1.speed=0;
		
		Car myCar2= new Car(); // 클래스(설계도)를가지고 무한으로 만들수있음 객체 
		myCar2.color="파랑";
		myCar2.speed=0;
         
		Car myCar3= new Car(); 
		myCar3.color="노랑";
		myCar3.speed=0;
         
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은"+myCar1.color+"이며, 현재속도는"+myCar1.speed+"km입니다.");
	    myCar2.upSpeed(60);
		System.out.println("자동차2의 색상은"+myCar2.color+"이며, 현재속도는"+myCar2.speed+"km입니다.");
		myCar3.upSpeed(0);
		System.out.println("자동차3의 색상은"+myCar3.color+"이며, 현재속도는"+myCar3.speed+"km입니다.");
	}

}
