package shop;

// 우리 제품을 이용하는 고객들 정보 저장
public class User {
	private String name; //고객명
	//결제방법 enum클래스이름 변수명;
	private PayType payType;
	
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}

	public PayType getPayType() {
		return payType;
	}

	public String getName() {
		return name;
	} 		
	
	
	
}
