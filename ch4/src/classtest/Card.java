package classtest;

public class Card {
	// 멤버변수(인스턴스 변수)
	String kind;
	int number;
	
	// 클래스 변수 = 공유
	static int width = 100; // 카드크기는 바뀌지 않음
	static int height = 150; // 카드크기는 바뀌지 않음
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	
}
