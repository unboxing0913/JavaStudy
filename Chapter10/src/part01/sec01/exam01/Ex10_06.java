package part01.sec01.exam01;


class Car6{
	private String color;
	private int speed;
	
	//void Car6(){    => �����ڰ��ƴ� �޼ҵ���ν��ع���
    //   System.out.println("Java"); //�����ڵ� �޼ҵ�
	//}
		      
    
	/*
	 * 
	 
	 Car6(){   //�⺻������ , �Ƚᵵ �����Ϸ��� ���� ������
    	 
     }
	
	 * �⺻ ������(�ƹ��ϵ� ���� �ʴ� ������)
	 * ������:������ ���� ,���� ���ٸ� �����Ϸ��� ���� ����(��,�츮 ���� �Ⱥ��δ�)
	 * �����ڴ� Ŭ���� �̸��� ���ƾ� �Ѵ�.
	 * �����ڵ� �޼ҵ��� �� �����̴�(ȣ���ؾ� �۵��Ѵ�).
	 * ��ȯŸ���� �������� ����.
	 * �����ڴ� �ַ� ��ü ������ ȣ��Ǹ� ��ü �ʱ�ȭ �� �� ����Ѵ�.
	 */
	
	Car6(){
		color="����";
		speed=0;
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

public class Ex10_06 {


	public static void main(String[] args) {
		    Car6 myCar1 = new /**/Car6()/**/; //�����ڸ� ȣ��         //������ȣ��� ���ÿ� ��ü������ �ڵ� :��ü����(new),������ȣ�� Car6()
		    //myCar1.Car6();              
		    //myCar1.color="����"; //ĸ��ȭ���Ѽ� �ܺ�Ŭ���� ���ٱ��� 
		    //myCar1.speed=0;
		    myCar1.setColor("����2"); //���ο������� �����
		    myCar1.setSpeed(0);
		    
		    Car6 myCar2 = new Car6();		   
		    myCar2.setColor("�Ķ�2");
		    myCar2.setSpeed(0);
		    
		    System.out.println("�ڵ��� 1�� ������"+myCar1.getColor()+"�̸�, ����ӵ��� "+myCar1.getSpeed()+"km �Դϴ�.");
		    System.out.println("�ڵ��� 2�� ������"+myCar2.getColor()+"�̸�, ����ӵ��� "+myCar2.getSpeed()+"km �Դϴ�.");
	}

}
