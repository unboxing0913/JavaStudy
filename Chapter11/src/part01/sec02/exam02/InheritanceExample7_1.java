package part01.sec02.exam02;

public class InheritanceExample7_1 {

	public static void main(String[] args) { //������ static 
		Account obj1=new Account("111-22-333333","�Ӳ���",10000);
//		CheckingAccount obj2=new CheckingAccount("444-55-666666","ȫ�浿",20000,"5555-6666-7777-8888");
//		CreditLineAccount obj3=new CreditLineAccount("777-88-999999","�輱��",30000,2000000);
//		BonusPointAccount obj4=new BonusPointAccount("000-00-000000","��̿�",0,0);
		
		
		Account obj2=new CheckingAccount("444-55-666666","ȫ�浿",20000,"5555-6666-7777-8888");
		Account obj3=new CreditLineAccount("777-88-999999","�輱��",30000,2000000);
		Account obj4=new BonusPointAccount("000-00-000000","��̿�",0,0);
		//�ڱ� �θ�Ÿ���϶��� ����� 
		//��Ӱ��迡�� �ڽĵ��� �θ�Ÿ�������ص� ����ȴ� (������)
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);

	}
	// �޼ҵ带 ���� ���� ������ ����ϼ���
	public static void printAccountInfo(Account obj){	 //Ŭ����Ÿ�� (�ִ��ʹ޴��� ���ƾ���)
	System.out.println("���¹�ȣ : "+obj.accountNo);
	System.out.println("������ �̸� : "+obj.ownerName);
	System.out.println("�ܾ�:"+obj.balance);
	System.out.println();
	}
    /*  �ڡ� ����϶������� �ڡڡڡڡڡڡڡڡ�
     * �ּ��ص� �Ǵ������� ��Ӱ����� ������ �����̴�. (Ÿ���� �θ�Ÿ������ ���ָ� �ذ��)
     * 
	public static void printAccountInfo(CheckingAccount obj){ // �޼ҵ� �����ε�		
	System.out.println("���¹�ȣ"+obj.accountNo);
	System.out.println("������ �̸�"+obj.ownerName);
	System.out.println("�ܾ�:"+obj.balance);
	System.out.println();
	}
	
	public static void printAccountInfo(CreditLineAccount obj){		
	System.out.println("���¹�ȣ"+obj.accountNo);
	System.out.println("������ �̸�"+obj.ownerName);
	System.out.println("�ܾ�:"+obj.balance);
	System.out.println();
	}
	
	public static void printAccountInfo(BonusPointAccount obj){		
	System.out.println("���¹�ȣ"+obj.accountNo);
	System.out.println("������ �̸�"+obj.ownerName);
	System.out.println("�ܾ�:"+obj.balance);
	System.out.println();
	}
   */
}
