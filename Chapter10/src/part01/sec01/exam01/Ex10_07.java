package part01.sec01.exam01;

class Car7{
	
private String color;
private int speed;

/*
 * 			
 *  Car7(){
 * 
 *  
 *   }
 */

Car7(String color,int speed){       //객체의 값을 받을수잇는 생성자를 만들어준것
	this.color=color;
	this.speed=speed;			
}



String getColor() {
	return color;
}

int getSpeed() {
	return speed;
}

void setColor(String color) {
	this.color=color;
}
void setSpeed(int speed) {
	this.speed=speed;
}


}

public class Ex10_07 {

	public static void main(String[] args) {
	   Car7 myCar1=new Car7("빨강",30);
	   Car7 myCar2=new Car7("파랑",30);
	
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며,"+"현재속도는"+myCar1.getSpeed()+"km입니다.");
		System.out.println("자동차2의 색상은"+myCar2.getColor()+"이며,"+"현재속도는"+myCar2.getSpeed()+"km입니다.");
		
	

	}

}
