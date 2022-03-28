package extend;

public class CheckingTrafficCardAccount extends CheckingAccount {
	
	//교통카드 기능(true , false) : hasTrafficCard
	
	private boolean hasTrafficCard;

	public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo, boolean hasTrafficCard) {
		super(accountNo, owner, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
		// TODO Auto-generated constructor stub
	}
	//교통비 지불한다. - payTrafficCard
	//cardNo, 교통카드 사용액을 매개변수로 받는다.
	int payTrafficCard(String cardNo, int amount) {
		//교통카드 기능이 있는지 확인한다.
		if (!hasTrafficCard) {
			System.out.println("교통카드기능이 없습니다.");
			return -1;
		}
		//부모의 pay 호출
		return Pay(cardNo, amount);
	}
	
}
