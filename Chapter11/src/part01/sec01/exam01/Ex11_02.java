package part01.sec01.exam01;

class Car2{
	
	Car2(){
		System.out.println("���� Ŭ���� ������ ȣ��"); }
}

class Sedan2 extends Car2{
	
	Sedan2(){
		System.out.println("���� Ŭ������ ������ ȣ��");
	}
	
} 
//���߿�!!!  ������� �߿��� (�θ�Ŭ�������������������� �ڽ�Ŭ������ ���������ʱ⶧���� �θ�Ŭ����������)

public class Ex11_02 {

	public static void main(String[] args) {  
		Sedan2 sedan2=new Sedan2(); //��ӹ޾ұ⶧���� �ڽ�Ŭ������ ��ü�����ص� �θ�Ŭ���� �����ڱ��� ����ȴ�.
		//Car2 sedan2=new Car2(); //��Ӱ��迡�� �θ�ü�� ���������� �ڽİ�ü�� ����ȵ�
	}

}
