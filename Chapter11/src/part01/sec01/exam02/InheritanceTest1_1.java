package part01.sec01.exam02;

class A{
	int aa=1;
}

class B extends A{
	int bb=2;
}

class C extends B{
	int cc=3;
}

public class InheritanceTest1_1 {
	

	public static void main(String[] args) {
		C obj = new C();
		System.out.println("obj��ü�� ��ü�Ӽ� ���� aa�� ����=> "+obj.aa);
		System.out.println("obj��ü�� ��ü�Ӽ� ���� bb�� ����=> "+obj.bb);
		System.out.println("obj��ü�� ��ü�Ӽ� ���� cc�� ����=> "+obj.cc);

	}

}
