package part01.sec02.exam06;

public class MethodExample5 {

	public static void main(String[] args) {
		Account obj=new Account("777-777-7777777","�ִ��",10000);
		
		try {                            //�õ��ϴ�  
		int amount=obj.withdraw(100000);
		System.out.println("����� :"+amount);
		}catch(Exception e){//������ ���⼭�޾���                   //�õ��ϴٰ� ������ ���� ����ش� �ؿ� 
	    String msg=e.getMessage();
		System.out.println(msg);
		}

	}

}
