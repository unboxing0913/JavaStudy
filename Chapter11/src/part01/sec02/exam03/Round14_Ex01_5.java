package part01.sec02.exam03;

interface A1{     //==>������ public static final�� �ν�   // �ؿ� �ʵ���� ���� �����ǹ�(public static final)
	int w=10;
	static int x=20;
	final int y=30;
	public static final int z=40;
	
}

public class Round14_Ex01_5 {

	public static void main(String[] args) {
		//A1 ap=new A1();
		//A1.w=100;
		System.out.println("w="+A1.w);  //Ŭ���� �̸����� ���� �����ؼ� ��밡��
		System.out.println("x="+A1.x);
		System.out.println("y="+A1.y);
		System.out.println("z="+A1.z);
		
	}

}
