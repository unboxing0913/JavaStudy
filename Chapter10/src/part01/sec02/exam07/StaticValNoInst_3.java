package part01.sec02.exam07;

class InstCnt2{
	static int instNum=100; // static ������ ��ü�� �����Ǳ� ������ ������ �޸� ������ �Ҵ�
	
	InstCnt2(){
		instNum++;
		System.out.println("�ν��Ͻ� ����:"+instNum);
	}
	
}
/*
 * static ������ �ʱ�ȭ ����?
 * JVM�� ���ؼ� Ŭ������ �޸� ������ �ö󰡴� ����
 */

public class StaticValNoInst_3 {

	public static void main(String[] args) {
           InstCnt2.instNum-=15; //��ü�� ��� ���� �ٲ��ټ��ִ�.
           System.out.println(InstCnt2.instNum);

	}

}
