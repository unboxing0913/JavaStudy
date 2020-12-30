package chapter6.exam;

public class Account {
	private int balance=0;
    public final static int MIN_BALANCE=0;
    public final static int MAX_BALANCE=1000000;
    
    
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE||balance>Account.MAX_BALANCE) {
			return;
		}else {
			this.balance=balance;
		}
		
	}
	

}
