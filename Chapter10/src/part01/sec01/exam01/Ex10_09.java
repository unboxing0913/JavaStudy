package part01.sec01.exam01;

class Calc{
	
	void addValue(double v1,double v2) {                 //���ϸ޼ҵ带 ȣ���Ҷ� �Ű������� �����̰���
		System.out.println("double�� ��� ==> "+(v1+v2));
	}
	void addValue(int v1,int v2) {
		System.out.println("int�� ��� ==> "+(v1+v2));
	}	
	void addValue(double v1) {                          //���ϸ޼ҵ����� �����̵Ǹ� ����̾���.
		System.out.println("double�� ��� ==> "+(v1));
	}
}


public class Ex10_09 {

	public static void main(String[] args) {
		Calc myCalc = new Calc();
		
		myCalc.addValue(1.0,1.0);
		myCalc.addValue(1,1);
		myCalc.addValue(0.1);

	}

}
