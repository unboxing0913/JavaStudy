package part01.sec02.exam03;

class A4{
	
	void methodA(){
		I2 i = InstanceManager.getInstance(); //�����޼ҵ� ȣ��
		//��ȯ �� ���� I2Ÿ�� ����
		i.methodB(); //��ȯ�� 	
	}
}

interface I2{
	
	public abstract void methodB();
	
}

class B3 implements I2{
	
	public void methodB() {
		System.out.println("methodB in B2 class");
	}	
}

class InstanceManager{
	
	public static I2 getInstance() {
//	   I2 i = new B3(); //��ü����
//	   return i; //��ȯ
	   
	   return new B3();  // ��ȯ���� �ٷ� ��ü�����ؼ� ����������
	}
}


public class InterfaceTest3_8 {

	public static void main(String[] args) {

		A4 a=new A4();
		a.methodA();
		

	}

}
