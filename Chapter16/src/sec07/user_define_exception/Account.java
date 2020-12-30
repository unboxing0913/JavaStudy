package sec07.user_define_exception;
/*예외발생*/
public class Account {

  private long balance;
  
  public Account() {
	  
  }
  
  public long getBalance() {
	  return balance;
  }
  
  public void deposit(int money) {
	  balance+=money;
  }
  
  public void withdraw(int money) throws BalanceInsufficientException {
	  if(balance<money) {
		  throw new BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람"); 
    /*throw 예외발생*/
	  }
	  balance-=money;
  }

}
