package part01.sec01.exam01;

class Car8 {

	private String color;
	private int speed; 
                                                // �����ڴ� 1���� ����ǰ� �Ǿ�����.
	Car8() {                        //������1
        
	}

	Car8(String color) {            //������2
		this.color = color;
		
	}

	Car8(String color, int speed) { //������3
		this.color = color;
		this.speed = speed;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class Ex10_08 {

	public static void main(String[] args) {
      
		Car8 myCar1 = new Car8();//�⺻������ () �ƹ��͵������� () ���� ������(�޼ҵ�)ȣ��            /������1
		Car8 myCar2 = new Car8("����"); //�ι�° ������  (string��) �ִ� ������(�޼ҵ�) ȣ��       /������2
		Car8 myCar3 = new Car8("�Ķ�",30);//����° ������ (string��,int��)�ִ� ������(�޼ҵ�)ȣ��     /������3
		
		
		System.out.println("�ڵ���1�� ������"+myCar1.getColor()+"�̸�,"+"����ӵ���"+myCar1.getSpeed()+"km�Դϴ�.");
		System.out.println("�ڵ���2�� ������"+myCar2.getColor()+"�̸�,"+"����ӵ���"+myCar2.getSpeed()+"km�Դϴ�.");
		System.out.println("�ڵ���2�� ������"+myCar3.getColor()+"�̸�,"+"����ӵ���"+myCar3.getSpeed()+"km�Դϴ�.");
 	}

}













