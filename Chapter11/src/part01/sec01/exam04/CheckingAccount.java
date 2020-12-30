package part01.sec01.exam04;

public class CheckingAccount extends Account{ 
	String cardNo; 
	
	CheckingAccount(String accountNo,String ownerName,int balance,String cardNo){
//		this.accountNo=accountNo;                 //부모생성자가있기때문
//		this.ownerName=ownerName;
//		this.balance=balance;
//      자식이 부모 생성자를 호출 
		super(accountNo,ownerName,balance);  //반드시 먼저 호출되어야한다.
		this.cardNo=cardNo;
		
	}
	
	int pay(String cardNo,int amount)throws Exception{ 
		
		if(!(cardNo.equals(this.cardNo)&&(balance >= amount)))  
		throw new Exception("지불이 불가능 합니다.");               
		
		return withdraw(amount);
	
	}

}
