package part01.sec01.exam04;

public class Account {
	   String accountNo; //계좌번호
	   String ownerName; // 예금주
	   int balance; // 잔액
	   
	   Account(String accountNo,String ownerName,int balance){ //부모가 생성자를 가지고있는경우
		   this.accountNo=accountNo;
		   this.ownerName=ownerName;
		   this.balance=balance;
   }
	   
	   
	   void deposit(int amount) { //예금(입금)
		   balance+=amount;
	   }
	   
	   
	   int withdraw(int amount) throws Exception { // throw new 사용할때 예외처리를하겠다.
		   if(balance<amount)
			   throw new Exception("잔액이 부족합니다."); // 던져서 다른곳에서 처리
			   balance-=amount;
		   
		   return amount;
	   }

	public static void main(String[] args) {
		

	}

}
