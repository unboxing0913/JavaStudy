package part01.sec01.exam01;

class Car7{
	
private String color;
private int speed;

/*
 * 			
 *  Car7(){
 * 
 *  
 *   }
 */

Car7(String color,int speed){       //��ü�� ���� �������մ� �����ڸ� ������ذ�
	this.color=color;
	this.speed=speed;			
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

public class Ex10_07 {

	public static void main(String[] args) {
	   Car7 myCar1=new Car7("����",30);
	   Car7 myCar2=new Car7("�Ķ�",30);
	
		System.out.println("�ڵ���1�� ������"+myCar1.getColor()+"�̸�,"+"����ӵ���"+myCar1.getSpeed()+"km�Դϴ�.");
		System.out.println("�ڵ���2�� ������"+myCar2.getColor()+"�̸�,"+"����ӵ���"+myCar2.getSpeed()+"km�Դϴ�.");
		
	

	}

}
