package sec07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message=e.getMessage(); /*내가만든 예외처리*/
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); /*어디서 발생했는지 자세히조사*/
		}

	}

}
