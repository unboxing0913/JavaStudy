package part01.sec01.exam01;
                                          
class Car{ //!!Ŭ����(���赵)
	String color;     // !!�ʵ�(�Ӽ�)
	int speed;
	
	void upSpeed(int value) { //!! �޼ҵ�(���)
		speed+=value;  // �ʵ�(�Ӽ�)���ִ� ������ speed�� �޼ҵ�(���)�� �� �ʵ�� �޼ҵ��� ������ �ϳ��� ��� ����Ҽ��ְԲ�
	}
	void downSpeed(int value) {
		speed-=value;
	}
}

public class Ex10_01 { // . <- ���� ����
    
	public static void main(String[] args) {
	
		Car myCar1= new Car(); // ��ü���� (���赵 ��������) Ŭ����Ÿ�� Car       // myCar1(�ּ�����):��������
		myCar1.color="����";
		myCar1.speed=0;
		
		Car myCar2= new Car(); // Ŭ����(���赵)�������� �������� ��������� ��ü 
		myCar2.color="�Ķ�";
		myCar2.speed=0;
         
		Car myCar3= new Car(); 
		myCar3.color="���";
		myCar3.speed=0;
         
		myCar1.upSpeed(30);
		System.out.println("�ڵ���1�� ������"+myCar1.color+"�̸�, ����ӵ���"+myCar1.speed+"km�Դϴ�.");
	    myCar2.upSpeed(60);
		System.out.println("�ڵ���2�� ������"+myCar2.color+"�̸�, ����ӵ���"+myCar2.speed+"km�Դϴ�.");
		myCar3.upSpeed(0);
		System.out.println("�ڵ���3�� ������"+myCar3.color+"�̸�, ����ӵ���"+myCar3.speed+"km�Դϴ�.");
	}

}
