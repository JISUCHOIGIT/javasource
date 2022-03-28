package exception;

public class BalanceInsufficientException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BalanceInsufficientException() {
		//super 보이지 않지만 있음
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
