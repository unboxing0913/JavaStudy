package part01.sec01.exam01;
                               
class Car5{ 	
	
	private int speed;  // ��ų������� ���� Car5������ �����ְ�
	// public : �ܺο��� ���ٰ��� private�� �ݴ� //�ϳ������Ͼȿ� public�� ���θ� ���ε����Ҷ��� ����
	public void upSpeed(int value) { 
		if(speed+value>200) { //���罺�ǵ��Ǽӵ� + �ܺο����Ѿ�¼ӵ�
			speed=200; // 200�����Ѱ�
		}else {
			speed+=value;
		}
		System.out.println("����ӵ� ==>"+getSpeed()); // �޼ҵ�ȿ��� �޼ҵ�ȣ���Ҽ�����
		                                            //�޼ҵ� �ȿ��� ��°���
	}
	
	void downSpeed(int value) {
		if(speed-value<0) {
			speed=0;
		}else {
			speed-=value;
		}
		System.out.println("����ӵ� ==>"+getSpeed());
		
	}
	
	int getSpeed() {         //���罺�ǵ尪�� �������ִ� �޼ҵ�
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
