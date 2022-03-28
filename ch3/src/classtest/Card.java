package classtest;

public class Card {
	//멤버변수(인스턴스 변수)
	String kind;
	int number;
	
	//클래스 변수(초기화) = 공유 , 공통적 속성이 있을 경우 static 선언하는 것이 편함                                         
	static int width = 100; //static 선언된 클래스 변수는 클래스명.변수명으로 선언
	static int height = 150;
		
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

}
