package part01.sec01.exam01;

public class RefTypeExample6_3 {

	public static void main(String[] args) {
		Account obj=new CheckingAccount("111-22-333333333","ȫ�浿",100000,"4444-5555-6666-7777");
		
				
	//	CheckingAccount obj2=obj;   //�θ�Ÿ���� �ڽ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�̾ȵ�
		CheckingAccount obj2=(CheckingAccount)obj;       //ex) double a = 80;   :�ڵ�Ÿ�Ժ�ȯ
		//ĳ������ �ʿ������� : ���������� �ڽ� ��ü�� �����پ��� 
		
		try {
			int amount=obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("�����:"+amount);
			System.out.println("ī���ȣ:"+obj2.cardNo);
		}catch(Exception e) {
			System.out.println(e.getMessage());							
		}
		
	}

}
