package extend;

public class Car2 {
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public final void turnOff() { //final 사용으로 main에서 메소드 사용하지 못함
		System.out.println("시동을 끕니다.");
	}
}
