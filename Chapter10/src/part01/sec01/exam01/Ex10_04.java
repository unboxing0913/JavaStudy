package part01.sec01.exam01;
                    // 보편적으로 private 써서 막아둠                        
class Car4{ 	
	
	private String color;       
	private int speed; 
	
	void upSpeed(int value) { 
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
	
	void setColor(String color) { 
		this.color=color; 
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
}

public class Ex10_04 { 
    
	public static void main(String[] args) {
	
		Car4 myCar1= new Car4();  
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		myCar1.upSpeed(30); // Speed는캡슐화되있어서 직접사용못하지만 메소드에 사용해 메소드값을불러오면 가능함
		
 
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며, 현재속도는"+myCar1.getSpeed()+"km입니다."); 
		                                        
		
	}

}
