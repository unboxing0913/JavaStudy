package part01.sec01.exam01;

class Car10{
	String color; // ��ü�� �����ɶ����� ���θ������
	int speed;	  // ��ü�� �����ɴ븶�� ���θ������
	static int count=0; // static���� �޼ҵ���� �޼ҵ念���� ����(����)�� (���α׷� ������� �Լӻ�����)	
	                    
	
	Car10(){
		count++;
		speed++;
		
	}
}


public class Ex10_10 {

	public static void main(String[] args) { //static
		Car10 myCar1 = new Car10();
		System.out.println("���� ����� �ڵ��� ���� ==> "+myCar1.count+" "+myCar1.speed);
		Car10 myCar2 = new Car10();
		System.out.println("���� ����� �ڵ��� ���� ==> "+myCar2.count+" "+myCar2.speed);
		Car10 myCar3 = new Car10();
		System.out.println("���� ����� �ڵ��� ���� ==> "+Car10.count+" "+myCar3.speed);


	}

}
