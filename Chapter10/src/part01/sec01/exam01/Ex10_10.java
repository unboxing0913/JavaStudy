package part01.sec01.exam01;

class Car10{
	String color; // 객체가 생성될때마다 새로만들어짐
	int speed;	  // 객체가 생성될대마다 새로만들어짐
	static int count=0; // static붙은 메소드들은 메소드영역에 유지(공유)됨 (프로그램 종료까지 게속상주함)	
	                    
	
	Car10(){
		count++;
		speed++;
		
	}
}


public class Ex10_10 {

	public static void main(String[] args) { //static
		Car10 myCar1 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> "+myCar1.count+" "+myCar1.speed);
		Car10 myCar2 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> "+myCar2.count+" "+myCar2.speed);
		Car10 myCar3 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> "+Car10.count+" "+myCar3.speed);


	}

}
