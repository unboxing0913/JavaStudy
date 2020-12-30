package part01.sec01.exam01;
                                          
class Car3{ 	
	// private ==> 캡슐화(외부로부터 보호,자기자신 클래스 제외) : Car3 를 제외한 나머지는 다 외부
	// 필드에 직접 접근하지 말고 메소드를 통해서 접근 유도
	// 클래스의 선언된 변수를 field(필드)
	private String color; // default값 NULL(주소값을가지고있지않다)      
	private int speed; // default값 0
	
	void upSpeed(int value) { //method(메소드)
		speed+=value;
	}
	void downSpeed(int value) {
		speed-=value;
	}
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) { // 값을 저장
		//color=color;  //전역변수 = 지역변수 : 지역변수가우선이되기때문에 지역변수 = 지역변수	
	                    //필드명과 매개변수변수와 동일할경우 무조건 지역변수 우선
	    //color2=color; //겹치지않으면 해결됨
		this.color=color; // this : 자기자신 Class
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
}

public class Ex10_03 { 
    
	public static void main(String[] args) {
	
		Car3 myCar1= new Car3();  
		myCar1.setColor("빨강");      //저장된 값                                                
		myCar1.setSpeed(30);
		

		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며, 현재속도는"+myCar1.getSpeed()+"km입니다."); 
		                                         //가져온 값    
		
	}

}
