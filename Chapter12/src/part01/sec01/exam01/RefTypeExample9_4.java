package part01.sec01.exam01;

public class RefTypeExample9_4 {

	public static void main(String[] args) {
		   Account obj=new Account("111-22-333333333","ȫ�浿",100000);
		   
		   CheckingAccount obj2=(CheckingAccount)obj;       
			 // ����Ÿ�Ժ�ȯ�� �ڽ�Ÿ���� �θ�Ÿ������ �ڵ���ȯ������ �ٽ� �ڽ�Ÿ������ ��ȯ�Ҷ��� ��ȿ�ϴ�.
			
			try {
				int amount=obj2.pay("4444-5555-6666-7777",47000);
				System.out.println("�����:"+amount);
				System.out.println("ī���ȣ:"+obj2.cardNo);
			}catch(Exception e) {
				System.out.println(e.getMessage());							
			}
			
		}

	}


