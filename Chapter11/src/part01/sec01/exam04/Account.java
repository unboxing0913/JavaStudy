package part01.sec01.exam04;

public class Account {
	   String accountNo; //���¹�ȣ
	   String ownerName; // ������
	   int balance; // �ܾ�
	   
	   Account(String accountNo,String ownerName,int balance){ //�θ� �����ڸ� �������ִ°��
		   this.accountNo=accountNo;
		   this.ownerName=ownerName;
		   this.balance=balance;
   }
	   
	   
	   void deposit(int amount) { //����(�Ա�)
		   balance+=amount;
	   }
	   
	   
	   int withdraw(int amount) throws Exception { // throw new ����Ҷ� ����ó�����ϰڴ�.
		   if(balance<amount)
			   throw new Exception("�ܾ��� �����մϴ�."); // ������ �ٸ������� ó��
			   balance-=amount;
		   
		   return amount;
	   }

	public static void main(String[] args) {
		

	}

}
