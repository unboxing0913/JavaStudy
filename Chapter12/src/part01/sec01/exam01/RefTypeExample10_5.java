package part01.sec01.exam01;

public class RefTypeExample10_5 {

	public static void main(String[] args) {
		 Account obj=new Account("111-22-333333333","ȫ�浿",100000);
		 
		if(obj instanceof CheckingAccount) {   //instanceof : ����ȯ�� �����Ѱ�?
			pay((CheckingAccount)obj);
	      }else {
			System.out.println("ĳ���� �� �� ���� Ÿ���Դϴ�.");
	      }
	}	
	
	
	static void pay(CheckingAccount obj) {
			try {
				int amount=obj.pay("4444-5555-6666-7777",47000);
				System.out.println("�����:"+amount);
				System.out.println("ī���ȣ:"+obj.cardNo);
			}catch(Exception e) {
				System.out.println(e.getMessage());							
			}
			
		}
	
}

