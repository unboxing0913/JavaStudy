package part01.sec02.exam02;

class Father{
	public void play() {
		System.out.println("father : swimming ");
	}
	
	public void study() {
		System.out.println("father : java programming");
	}
}

class Johnharu extends Father{
	
	public void study(){
		System.out.println("johnharu:C# Programming");
	}
}

class Gracedew extends Father{
	public void play() {
		System.out.println("gracedew:BaseBall");
	}	
}

class Moon extends Father{
	public void play() {
		System.out.println("moon:BaskeBall");
	}
	public void study() {
		System.out.println("moon:Visual Basic,Visual C++");
	}
}


public class Family_2 {

	public static void main(String[] args) { //������
		
		Father daddy=new Father();   
		daddy.play();
		daddy.study();        //�θ�Ŭ���� ����
		
		daddy=new Johnharu(); //Father�� study�� �������̵� �ϰ�����
		daddy.play(); // �θ��� play���� 
		daddy.study();  // �������̵��� study����
		
		daddy=new Gracedew();
		daddy.play(); // �������̵��� paly����
		daddy.study(); // �θ��� study����
		
		daddy=new Moon(); // Moon daddy2 = new Moon �� �������.
		daddy.play(); //�Ѵٿ������̵�
		daddy.study(); //�Ѵٿ������̵� 
		

	}

}
