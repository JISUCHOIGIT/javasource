package extend;

public class CellPhone {
//	model 
//	color 
//	전원을 켜고 끄기 
//	벨이 울린다
//	메시지를 주고 받기(음성)
//	전화 끊기
	
	//속성
	String model;
	String color;
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String msg) {
		System.out.println("본인 : "+msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방 : "+msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
