package part01.sec01.exam01;

class Car3{
	Car3(){
		System.out.println("���� Ŭ���� ������ȣ��(�Ƕ���� ����)");
	}
	
	Car3(String str){
		System.out.println("���� Ŭ���� ������ ȣ��==>"+str);
	}
}

class Sedan3 extends Car3{
	
	Sedan3(String str){
		System.out.println("���� Ŭ���� ������ ȣ�� ==>"+str);
	}
	
}

public class Ex11_03 {

	public static void main(String[] args) {
		Sedan3 sedan3=new Sedan3("�����~~~");

	}

}
