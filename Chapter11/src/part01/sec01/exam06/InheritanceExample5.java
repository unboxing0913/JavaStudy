package part01.sec01.exam06;

public class InheritanceExample5 {

	public static void main(String[] args) {
		BonusPointAccount obj=new BonusPointAccount("333-33-333333","ȫ�浿",0,0);
		
			obj.deposit(1000000);
			System.out.println("�ܾ�: "+obj.balance);
			System.out.println("��������Ʈ: "+obj.bonusPoint);
		

	}

}
