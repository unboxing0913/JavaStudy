package part01.sec01.exam01;

public class Ex09_15 {//Ŭ������ ������ ������
     //Ŭ�����ȿ������ �������� �ʵ�� �迭���������� �ʱⰪ0
	static int a=100;//��������(�ʵ�)
    
	static void func1() {                 //������ ��ġ�°�� ���������� �켱!
		int a=200;//�޼ҵ�ȿ� ���� : ��������
		System.out.printf("func1()���� a�� ��==>%d\n",a);//�������� a �� 200
	}
	
	public static void main(String[] args) {
		        // int a = 300; => ������ ���������켱
                func1();//�������� 
                System.out.printf("main()���� a�� ��==>%d\n",a);
		
		
	}
        //static �����ֵ��� �޸𸮿� �����Ǹ����������.
}
