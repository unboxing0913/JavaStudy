package part01.sec01.exam01;

class Car8 {

	private String color;
	private int speed; 
                                                // 생성자는 1개만 실행되게 되어있음.
	Car8() {                        //생성자1
        
	}

	Car8(String color) {            //생성자2
		this.color = color;
		
	}

	Car8(String color, int speed) { //생성자3
		this.color = color;
		this.speed = speed;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class Ex10_08 {

	public static void main(String[] args) {
      
		Car8 myCar1 = new Car8();//기본생성자 () 아무것도없으니 () 없는 생성자(메소드)호출            /생성자1
		Car8 myCar2 = new Car8("빨강"); //두번째 생성자  (string값) 있는 생성자(메소드) 호출       /생성자2
		Car8 myCar3 = new Car8("파랑",30);//세번째 생성자 (string값,int값)있는 생성자(메소드)호출     /생성자3
		
		
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며,"+"현재속도는"+myCar1.getSpeed()+"km입니다.");
		System.out.println("자동차2의 색상은"+myCar2.getColor()+"이며,"+"현재속도는"+myCar2.getSpeed()+"km입니다.");
		System.out.println("자동차2의 색상은"+myCar3.getColor()+"이며,"+"현재속도는"+myCar3.getSpeed()+"km입니다.");
 	}

}













