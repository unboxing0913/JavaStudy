package sec07.user_define_exception;
/*사용자 정의 예외처리 클래스 만들기*/
public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
