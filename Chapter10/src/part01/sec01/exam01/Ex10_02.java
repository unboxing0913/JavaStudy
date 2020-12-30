package part01.sec01.exam01;
                                          
class Car2{ //같은 패키지 안에 동일한 클래스 생성불가
	String color;   // default값 NULL(주소값을가지고있지않다)
	int speed;
	
	void upSpeed(int value) { 
		speed+=value;
	}
	void downSpeed(int value) {
		speed-=value;
	}
	String getColor() { //값을 반환한다  : 반환값을 리턴한다
		return color;
	}
	int getSpeed() {
		return speed;
	}
}

public class Ex10_02 { 
    
	public static void main(String[] args) {
	
		Car2 myCar1= new Car2();  // 같은 패키지 내에서는 전에 만들었던 클래스(설계도)를 사용할수있다.
		myCar1.color="빨강";   // String 주소값 여기서 받음
		myCar1.speed=0;
		
         
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은"+myCar1.color+"이며, 현재속도는"+myCar1.speed+"km입니다.");
		myCar1.upSpeed(-30);
		System.out.println("자동차2의 색상은"+myCar1.getColor()+"이며, 현재속도는"+myCar1.getSpeed()+"km입니다.");
		                            // 직접 메소드를 호출해서사용.
		
	}

}
