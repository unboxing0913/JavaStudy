package part01.sec01.exam01;
                               
class Car5{ 	
	
	private int speed;  // 잠궈놓은거임 현재 Car5에서만 쓸수있게
	// public : 외부에서 접근가능 private와 반대 //하나의파일안에 public은 메인만 따로따로할때는 가능
	public void upSpeed(int value) { 
		if(speed+value>200) { //현재스피드의속도 + 외부에서넘어온속도
			speed=200; // 200을못넘게
		}else {
			speed+=value;
		}
		System.out.println("현재속도 ==>"+getSpeed()); // 메소드안에서 메소드호출할수있음
		                                            //메소드 안에서 출력가능
	}
	
	void downSpeed(int value) {
		if(speed-value<0) {
			speed=0;
		}else {
			speed-=value;
		}
		System.out.println("현재속도 ==>"+getSpeed());
		
	}
	
	int getSpeed() {         //현재스피드값을 리턴해주는 메소드
		return speed;
	    }	
    }

public class Ex10_05 { 
    
	public static void main(String[] args) {
	
		Car5 myCar1= new Car5();  
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
		
		                                        
		
	}

}
