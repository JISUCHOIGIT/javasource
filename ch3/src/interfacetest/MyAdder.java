package interfacetest;

// 인터페이스를 구현(implements)하는 클래스
// Adder의 인터페이스 상수들을 다 사용하면서 구현하고 새로운 클래스를 생성하는 것
// 틀 + 새로운 틀

public class MyAdder implements Adder {

	@Override
	public void print() {
		System.out.println("출력");

	}

	@Override
	public int add(int x, int y) {
		return x + y; //public 키워드 생략 가능
	}
}
