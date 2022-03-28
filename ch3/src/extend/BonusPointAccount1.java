package extend;

public class BonusPointAccount1 extends Account {
	
	private int bounusPoint;

	public BonusPointAccount1(String accountNo, String owner, int balance,int bounusPoint) {
		super(accountNo, owner, balance);
		this.bounusPoint = bounusPoint;
		// TODO Auto-generated constructor stub
	}

}
