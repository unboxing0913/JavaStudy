package part01.sec02.exam07;

/*
 * static���� ����� ������ ������ ����� Ŭ������ ��� ��ü�� �����ϴ� �����̴�.
 * static���� ����� ������ �޸� ������ �ϳ��� �����ϸ� ��𼭳� ������ ������ �����̴�.
 * ��, ��𼭳� ������ �����Ϸ��� static ������ public���� ����Ǿ�� �Ѵ�.
 * static ���� ���� ������ ���� �����ʵ�,�����޼���,���� �ʱ�ȭ ����� �ִ�.
 * 
 */

class InstCnt{
	static int instNum=0;  //��ü������ ���ص��Ǵ� ��������̱⶧����  �ؿ��� ���������Կ� ���� �����Ȱ��� �����
	//��ü�� �����Ǳ����� ����������� 
	public InstCnt() {
           instNum++;
           System.out.println("�ν���Ʈ ����: "+instNum);
		
		
	}
}


public class ClassVar {

	public static void main(String[] args) {
      InstCnt cnt1=new InstCnt();
      InstCnt cnt2=new InstCnt();
      InstCnt cnt3=new InstCnt();
      

	}

}
