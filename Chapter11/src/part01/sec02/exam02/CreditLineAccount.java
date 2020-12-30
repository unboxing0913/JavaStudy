package part01.sec02.exam02;

public class CreditLineAccount extends Account { //마이너스 계좌
	int creditLine;

	CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
		
	
	}
	
	int withdraw(int amount) throws Exception { // 오버라이딩 할경우 부모 메서드는 무시함
		if((balance+creditLine)<amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		    balance-=amount;
			return amount;
		
	}
	
}
