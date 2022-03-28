package exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		Account[] account = new Account[2];
		System.out.println(account[0]);
		
		
//		System.out.println(account[0].accountNo); //null 포인트!
		
		try {
			System.out.println(account[0].accountNo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}