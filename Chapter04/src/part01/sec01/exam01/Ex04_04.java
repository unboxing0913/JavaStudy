package part01.sec01.exam01;

public class Ex04_04 {

	public static void main(String[] args) {
		int a=10,b;
		
		b=a++;//a�� �ܵ����� ������ ������� ��򰡿� ���ԉ������� ����
		      //a������ �߽����� �� (���� ������)
		System.out.printf("%d\n",b);
		System.out.println(a); //a++�� ��򰡿� ���ԵǾ������� ������ ������ a�ǰ�������
		                           // ���������� ����
		
		
		
		
		b=++a;//a������ �߽����� �� (���� ������)
		      //���� ��������Ű�� ���� (a++�� �ݴ�)

		System.out.printf("%d\n",b);
		System.out.println(a);
	

	}

}
