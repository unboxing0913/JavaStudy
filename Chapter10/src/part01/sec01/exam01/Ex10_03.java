package part01.sec01.exam01;
                                          
class Car3{ 	
	// private ==> ĸ��ȭ(�ܺηκ��� ��ȣ,�ڱ��ڽ� Ŭ���� ����) : Car3 �� ������ �������� �� �ܺ�
	// �ʵ忡 ���� �������� ���� �޼ҵ带 ���ؼ� ���� ����
	// Ŭ������ ����� ������ field(�ʵ�)
	private String color; // default�� NULL(�ּҰ��������������ʴ�)      
	private int speed; // default�� 0
	
	void upSpeed(int value) { //method(�޼ҵ�)
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
	
	void setColor(String color) { // ���� ����
		//color=color;  //�������� = �������� : �����������켱�̵Ǳ⶧���� �������� = ��������	
	                    //�ʵ��� �Ű����������� �����Ұ�� ������ �������� �켱
	    //color2=color; //��ġ�������� �ذ��
		this.color=color; // this : �ڱ��ڽ� Class
	}
	void setSpeed(int speed) {
		this.speed=speed;
	}
	
}

public class Ex10_03 { 
    
	public static void main(String[] args) {
	
		Car3 myCar1= new Car3();  
		myCar1.setColor("����");      //����� ��                                                
		myCar1.setSpeed(30);
		

		System.out.println("�ڵ���1�� ������"+myCar1.getColor()+"�̸�, ����ӵ���"+myCar1.getSpeed()+"km�Դϴ�."); 
		                                         //������ ��    
		
	}

}
