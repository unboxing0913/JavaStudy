package part01.sec02.exam02;

class A4{
	int x=10;
	
}

class B4 extends A4{
	int y=200;
}

public class Round13_Ex09_3 {

	public static void main(String[] args) {	 
		 /*
		 B4 ap=new B4();
		 
		 System.out.println("x="+ap.x); // �θ��� x�� ������
		 System.out.println("x="+ap.y);
		 */
         
		 /*
		 A4 ap=new A4();
		 
		 System.out.println("x="+ap.x);
		 System.out.println("x="+ap.y);  //������ ���� A4�� �θ�ü�⶧���� y���̾��� 
         */
		
		 A4 ap=new B4();//������(�������� �� ������ �θ� ���ַ� ó���Ѵ�,�� �ڽ��� ��������eld �ߴٸ� �ڽĿ��� ó���ڡڡڡ��߿�
		 
		 System.out.println("x="+ap.x);
		 // System.out.println("x="+ap.y); �θ����ַ� ó���Ǳ⶧���� y��ü�����⶧���� ����
		 
		 
	}

}
