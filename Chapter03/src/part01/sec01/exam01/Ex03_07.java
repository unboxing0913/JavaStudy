package part01.sec01.exam01;

public class Ex03_07 {

	public static void main(String[] args) {
		int a; // ������ ����(4byte)
		double b; // �Ǽ��� ����(8byte),floatŸ���� (4byte)
		
		a=(int) 123.45; // Ÿ�Ծȸ����� ���콺�ø��� casting�� Ÿ����ġ�ѵ� ���� �Ҽ���©��	[�Ҽ����ε� Int���ָ������]
		System.out.printf("a�� �� ==> %d\n",a);//java�� Ÿ���� ��ġ�ؾ� ���డ��
		
		b=200;//�����ȳ��������� �Ǽ����������� ũ�⶧�� ū�ʿ��� ������X
		System.out.printf("b�� �� ==> %f\n",b);

	}

}
