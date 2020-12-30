package part01.sec02.exam05;

public class Account {
   String accountNo; //계좌번호
   String ownerName; // 예금주
   int balance; // 잔액
   
   Account(String accountNo,String ownerName,int balance){
	   this.accountNo=accountNo;
	   this.ownerName=ownerName;
	   this.balance=balance;
   }
   
   
   void deposit(int amount) { //예금(입금)
	   balance+=amount;
   }
   
   
   int withdraw(int amount) { //인출(출금)
	   if(balance<amount){
		   //System.out.println("잔액이 부족합니다.");
		   return 0;
	
	   }else {
		   balance-=amount;
	   }
	   return amount;
   }
   
}
