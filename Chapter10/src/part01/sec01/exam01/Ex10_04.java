package part01.sec01.exam01;
                    // ���������� private �Ἥ ���Ƶ�                        
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
		myCar1.setColor("����");
		myCar1.setSpeed(0);
		myCar1.upSpeed(30); // Speed��ĸ��ȭ���־ �������������� �޼ҵ忡 ����� �޼ҵ尪���ҷ����� ������
		
 
		System.out.println("�ڵ���1�� ������"+myCar1.getColor()+"�̸�, ����ӵ���"+myCar1.getSpeed()+"km�Դϴ�."); 
		                                        
		
	}

}
