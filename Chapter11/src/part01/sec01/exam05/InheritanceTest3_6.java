package part01.sec01.exam05;

class B1 {
	int x;
}
class B2 extends B1 {
	String x;	//�θ�Ŭ������ ���� �̸��� ���� �� �ڽ� Ŭ���� ������ ���پ�
}
public class InheritanceTest3_6 {

	public static void main(String[] args) {
		B2 b2=new B2();
		b2.x="�ڹ� ��� ������ ...";
		System.out.println("��ü b2�� ����ִ� x�� :" +b2.x);
		
		B1 b1=new B1();
		b1.x=5000;
		System.out.println(b1.x);
	}

}
