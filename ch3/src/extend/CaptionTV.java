package extend;

//CaptionTV : TV + caption

public class CaptionTV extends TV {

//	String color;
//	boolean power;
//	int channel;
	
	//캡션 기능 (TV + 추가)
	boolean caption;
	void dispaly(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
	
//	//기능(method) : 전원 on/off, 채널 변경
//	void power() {
//		power = !power;
//	}
//	
//	void channelUp() {
//		channel++; // channel = channel + 1;
//	}
//	
//	void channelDown() {
//		channel--; // channel = channel - 1;
//	}
}
