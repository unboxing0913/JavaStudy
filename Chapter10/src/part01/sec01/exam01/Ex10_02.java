package part01.sec01.exam01;
                                          
class Car2{ //���� ��Ű�� �ȿ� ������ Ŭ���� �����Ұ�
	String color;   // default�� NULL(�ּҰ��������������ʴ�)
	int speed;
	
	void upSpeed(int value) { 
		speed+=value;
	}
	void downSpeed(int value) {
		speed-=value;
	}
	String getColor() { //���� ��ȯ�Ѵ�  : ��ȯ���� �����Ѵ�
		return color;
	}
	int getSpeed() {
		return speed;
	}
}

public class Ex10_02 { 
    
	public static void main(String[] args) {
	
		Car2 myCar1= new Car2();  // ���� ��Ű�� �������� ���� ������� Ŭ����(���赵)�� ����Ҽ��ִ�.
		myCar1.color="����";   // String �ּҰ� ���⼭ ����
		myCar1.speed=0;
		
         
		myCar1.upSpeed(30);
		System.out.println("�ڵ���1�� ������"+myCar1.color+"�̸�, ����ӵ���"+myCar1.speed+"km�Դϴ�.");
		myCar1.upSpeed(-30);
		System.out.println("�ڵ���2�� ������"+myCar1.getColor()+"�̸�, ����ӵ���"+myCar1.getSpeed()+"km�Դϴ�.");
		                            // ���� �޼ҵ带 ȣ���ؼ����.
		
	}

}
