package part01.sec02.exam05;

public class Account {
   String accountNo; //���¹�ȣ
   String ownerName; // ������
   int balance; // �ܾ�
   
   Account(String accountNo,String ownerName,int balance){
	   this.accountNo=accountNo;
	   this.ownerName=ownerName;
	   this.balance=balance;
   }
   
   
   void deposit(int amount) { //����(�Ա�)
	   balance+=amount;
   }
   
   
   int withdraw(int amount) { //����(���)
	   if(balance<amount){
		   //System.out.println("�ܾ��� �����մϴ�.");
		   return 0;
	
	   }else {
		   balance-=amount;
	   }
	   return amount;
   }
   
}
