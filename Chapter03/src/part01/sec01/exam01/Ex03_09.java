package part01.sec01.exam01;

public class Ex03_09 {

	public static void main(String[] args) {
		int a,b,c,d; 
		
		a=100+100; //������ 200�̶�°� ���밡�� : ���簪200
		b=a+100; // b���� 300
		//c=a+b+c; : c��������⶧���� ����+c������
        c=a+b+100; // ���簪600 c����600
        d=a+b+c; // d���� 1100
        
        System.out.printf("a,b,c,d �� �� ==>%d, %d, %d, %d\n",a,b,c,d);
                                           //d������ abcd
        a=b=c=d=100;//���Կ����� 100���� �����ʱ�ȭ (�̺κ��ʱ�ȭ)      
        System.out.printf("a,b,c,d �� �� ==>%d, %d, %d, %d\n",a,b,c,d);
        
        a=200;//�ʱ�ȭ
        a=a+200;//�ʱ�ȭ 200�� a�� ����
        a=a+200;//�ʱ�ȭ 400�� a�� ����
                // a=200; //200���� �ʱ�ȭ (�������������ʱ�ȭ ������ �̹� �Ǿ��⶧���� 600)
        
        System.out.printf("a�� �� ==>%d\n",a);
	}

}
