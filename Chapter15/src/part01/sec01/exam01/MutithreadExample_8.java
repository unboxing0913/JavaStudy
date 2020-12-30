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
	
	TransferThread(SharedArea area){       //클래스 생성자를 연결하는방식
		sharedArea = area;	
	}
	
	public void run() {
		for(int cnt=0;cnt<12;cnt++) {
			synchronized(sharedArea) { //동기화
		    sharedArea.account1.withdraw(1000000); // 접근방식
		    System.out.print("이몽룡 계좌 :100만원 인출");
		    sharedArea.account2.deposit(1000000);
		    System.out.println("성춘향 계좌 : 100만원 입금");
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
		 System.out.println("계좌 잔액 합계 :"+sum);
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
 * critical section:스레드 실행 중에 다른 스레드로 제어가 넘어가면 문제를 일으키는 부분
 * critical section의 동기화 (syncronization):critical section이 실행되는 동안 다른 스레드가
 * 공유데이터를 사용할 수 없도록 만드는 것
 * 
 */
public class MutithreadExample_8 {

	public static void main(String[] args) {
		SharedArea area=new SharedArea();
		area.account1=new Account("111-111-1111","이몽룡",20000000);
		area.account2=new Account("222-222-2222","성춘향",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
	
        thread1.start();
        thread2.start();
	}

}
