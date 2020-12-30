package part01.sec01.exam01;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName,int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount){
		balance+=amount;
	}
	int withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}
		balance-=amount;
		return amount;
	}
}

class SharedArea{
	Account account1;
	Account account2;
}

class TransferThread extends Thread{
	SharedArea sharedArea;
	
	TransferThread(SharedArea area){       //Ŭ���� �����ڸ� �����ϴ¹��
		sharedArea = area;	
	}
	
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			synchronized(sharedArea) { //����ȭ
		    sharedArea.account1.withdraw(1000000); // ���ٹ��
		    System.out.print("�̸��� ���� :100���� ����");
		    sharedArea.account2.deposit(1000000);
		    System.out.println("������ ���� : 100���� �Ա�");
			}
		  }
	}
}

class PrintThread extends Thread{
	 SharedArea sharedArea;
	 PrintThread(SharedArea area){
		 sharedArea=area;
	 }
	 
	 public void run() {
		 for(int cnt=0;cnt<3;cnt++) {
			 synchronized(sharedArea){
		 int sum=sharedArea.account1.balance+sharedArea.account2.balance;
		 System.out.println("���� �ܾ� �հ� :"+sum);
			 }
		 try {
			 Thread.sleep(1000);
		 }catch(InterruptedException e) {
			 System.out.println(e.getMessage());
		   }
		 }
	 }
}
/*
 * critical section:������ ���� �߿� �ٸ� ������� ��� �Ѿ�� ������ ����Ű�� �κ�
 * critical section�� ����ȭ (syncronization):critical section�� ����Ǵ� ���� �ٸ� �����尡
 * ���������͸� ����� �� ������ ����� ��
 * 
 */
public class MutithreadExample_8 {

	public static void main(String[] args) {
		SharedArea area=new SharedArea();
		area.account1=new Account("111-111-1111","�̸���",20000000);
		area.account2=new Account("222-222-2222","������",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
	
        thread1.start();
        thread2.start();
	}

}
