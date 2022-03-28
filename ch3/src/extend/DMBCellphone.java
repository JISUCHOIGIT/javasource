package extend;

// Cellphone + DMB기능 추가 = DMBCellphone

public class DMBCellphone extends CellPhone {
	// DMB만 가지고 있는 속성
	int channel;
	
	// DMB만 가지고 있는 기능
	void turnOn() {
		System.out.println("채널 "+ channel +"번 방송 시작");
	}
	
	void turnOff() {
		System.out.println("채널 "+ channel +"번 방송 종료");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+ this.channel +"번으로 변경");
	}
}
