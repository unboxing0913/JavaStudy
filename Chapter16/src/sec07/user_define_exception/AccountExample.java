package sec07.user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("���ݾ�:"+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {
			String message=e.getMessage(); /*�������� ����ó��*/
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); /*��� �߻��ߴ��� �ڼ�������*/
		}

	}

}
