package part01.sec01.exam04;

public class CheckingAccount extends Account{ 
	String cardNo; 
	
	CheckingAccount(String accountNo,String ownerName,int balance,String cardNo){
//		this.accountNo=accountNo;                 //�θ�����ڰ��ֱ⶧��
//		this.ownerName=ownerName;
//		this.balance=balance;
//      �ڽ��� �θ� �����ڸ� ȣ�� 
		super(accountNo,ownerName,balance);  //�ݵ�� ���� ȣ��Ǿ���Ѵ�.
		this.cardNo=cardNo;
		
	}
	
	int pay(String cardNo,int amount)throws Exception{ 
		
		if(!(cardNo.equals(this.cardNo)&&(balance >= amount)))  
		throw new Exception("������ �Ұ��� �մϴ�.");               
		
		return withdraw(amount);
	
	}

}
