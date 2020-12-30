package part01.sec01.exam07;

public abstract class Account { //abstract :추상 클래스,객체 생성 불가
	                            //abstract가 붙은 추상클래스의 자식클래스는 객체생성가능
	   String accountNo; 
	   String ownerName;
	   int balance; 
	   
	   Account(String accountNo,String ownerName,int balance){ 
		   this.accountNo=accountNo;
		   this.ownerName=ownerName;
		   this.balance=balance;
   }
	   
	   
	   void deposit(int amount) { 
		   balance+=amount;
	   }
	   
	   
	   int withdraw(int amount) throws Exception { 
		   if(balance<amount)
			   throw new Exception("잔액이 부족합니다."); 
			   balance-=amount;
		   
		   return amount;
	   }

	public static void main(String[] args) {
		

	}

}
