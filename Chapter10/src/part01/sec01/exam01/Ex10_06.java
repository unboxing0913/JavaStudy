package part01.sec01.exam01;


class Car6{
	private String color;
	private int speed;
	
	//void Car6(){    => 생성자가아닌 메소드로인식해버림
    //   System.out.println("Java"); //생성자도 메소드
	//}
		      
    
	/*
	 * 
	 
	 Car6(){   //기본생성자 , 안써도 컴파일러가 만들어서 삽입함
    	 
     }
	
	 * 기본 생성자(아무일도 하지 않는 생성자)
	 * 생성자:무조건 실행 ,만약 없다면 컴파일러가 만들어서 삽입(단,우리 눈에 안보인다)
	 * 생성자는 클래스 이름과 같아야 한다.
	 * 생성자도 메소드의 한 종류이다(호출해야 작동한다).
	 * 반환타입이 존재하지 않음.
	 * 생성자는 주로 객체 생성시 호출되며 객체 초기화 할 때 사용한다.
	 */
	
	Car6(){
		color="빨강";
		speed=0;
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

public class Ex10_06 {


	public static void main(String[] args) {
		    Car6 myCar1 = new /**/Car6()/**/; //생성자를 호출         //생성자호출과 동시에 객체를만든 코드 :객체성생(new),생성자호출 Car6()
		    //myCar1.Car6();              
		    //myCar1.color="빨강"; //캡슐화시켜서 외부클래스 접근금지 
		    //myCar1.speed=0;
		    myCar1.setColor("빨강2"); //새로운방법으로 덮어씌움
		    myCar1.setSpeed(0);
		    
		    Car6 myCar2 = new Car6();		   
		    myCar2.setColor("파랑2");
		    myCar2.setSpeed(0);
		    
		    System.out.println("자동차 1의 색상은"+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km 입니다.");
		    System.out.println("자동차 2의 색상은"+myCar2.getColor()+"이며, 현재속도는 "+myCar2.getSpeed()+"km 입니다.");
	}

}
