package interfacetest;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10; //public static final 생략
	int MIN_VOLUME = 0; //public static final 생략
	
	// 추상 메소드 // 각 클래스마다 다른 메소드를 기재해야 할때
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// default 메소드(8 버전부터 가능) = 공통기능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	// static 메소드(8 버전부터 가능)
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
