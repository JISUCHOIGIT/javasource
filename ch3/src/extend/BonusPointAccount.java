package extend;

public class BonusPointAccount extends Account {
	
	// 보너스 포인트
	private int bounsPoint;
	

	public BonusPointAccount(String accountNo, String owner, int balance,int bounsPoint) {
		super(accountNo, owner, balance);
		this.bounsPoint = bounsPoint;
	}

	@Override //메소드 오버라이딩
	int deposit(int amount) { //오버라이딩 : 추가기능
		// 예금
		super.deposit(amount); //부모 메소드 호출 -> super
		// 보너스 포인트 = 예금 * 0.1% -> 부모의 예금 메소드를 재정의 // 오버라이딩
		bounsPoint += (int)(amount * 0.001);
		return bounsPoint;
	}
	
	public int getBounsPoint() {
		return bounsPoint;
	}

	public void setBounsPoint(int bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	
	
}
