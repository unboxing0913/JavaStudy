package part01.sec01.exam06;

public class InheritanceExample5 {

	public static void main(String[] args) {
		BonusPointAccount obj=new BonusPointAccount("333-33-333333","홍길동",0,0);
		
			obj.deposit(1000000);
			System.out.println("잔액: "+obj.balance);
			System.out.println("누적포인트: "+obj.bonusPoint);
		

	}

}
