package part01.sec01.exam06;

public class BonusPointAccount extends Account {
    //오버라이딩 : 메소드재정의 => 상속에서만 존재 
	int bonusPoint;
	
	BonusPointAccount(String accountNo, String ownerName, int balance , int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}
	
	void deposit(int amount) {
		super.deposit(amount); // 부모한테있는 메소드호출 : 부모의메소드도 처리함
		bonusPoint+=(int)(amount*0.001); // 원래목적
		             //소수값 자르기위해 int로 캐스팅
	}

	public static void main(String[] args) {
	

	}

}
