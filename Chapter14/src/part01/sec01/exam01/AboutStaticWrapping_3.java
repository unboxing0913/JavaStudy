package part01.sec01.exam01;

public class AboutStaticWrapping_3 {

	public static void main(String[] args) {
		Integer iValue1=new Integer(10); //�����ڸ� ���ؼ�
		Integer iValue2=Integer.valueOf(10);  // �޼ҵ带 ���ؼ�      (������ ���� ��ü����)       
		Integer iValue3=Integer.valueOf(20);
		Integer iValue4=Integer.valueOf(20); //���������Ͻ� �������� (��ü������) //��ü�� �� ������������
		
		
		if(iValue1==iValue2) {
			System.out.println("iValue1�� iValue2�� ���� ��ü ����");
		}else {
			System.out.println("iValue1�� iValue2�� �ٸ� ��ü ����");
		}
		
		if(iValue2==iValue3) {
			System.out.println("iValue2�� iValue3�� ���� ��ü ����");
		}else {
			System.out.println("iValue2�� iValue3�� �ٸ� ��ü ����");
		}
		
		if(iValue3==iValue4) {
			System.out.println("iValue3�� iValue4�� ���� ��ü ����");
		}else {
			System.out.println("iValue3�� iValue4�� �ٸ� ��ü ����");
		}
			
	}

}
