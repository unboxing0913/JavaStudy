package part01.sec01.exam01;

// �ּ�(�Ǵ� ����)�� ����-call by address(reference)
       //Ŭ������ �׻� ù���ڴ빮�ڷ� (����)
class MyInt{ // Ŭ�����ȿ��� ����� �������� �޼ҵ�ȿ� ����Ⱥ����� ������ü���ٸ�.
	int a; //default ���� 0����������
	//sysout ��¾ȵ�
}

public class Ex09_18 { //�������� ã�ƺ����
	
	public static void func1(MyInt m) { //int:�ڷ���(Ÿ��)
		m.a=m.a+1;                                //MyInt Ŭ����(������������) Ÿ�� (�ȿ� int a)
		System.out.printf("���޹��� a==>%d\n",m.a);
	}

	public static void main(String[] args) {//Ŭ������ ������������ �����ϰ� main�� �� Ŭ������ �����̸����� �Ҽ��ְ� public �� ���ϼ�������
		//int a;
		//System.out.println(a); ���������� �ʱ�ȭ����� ����Ҽ�����
        MyInt m=new MyInt(); //���Կ�����(Ŭ����) : ����=(�ּ�)��                     
         //=>Ŭ���� ����¹�
        m.a=10;
        func1(m); // �ּҰ��Ѿ call by address(reference)
        System.out.printf("func1()���� ���� a==>%d\n",m.a);
        
	}

}      //.<= ���ٿ�����
