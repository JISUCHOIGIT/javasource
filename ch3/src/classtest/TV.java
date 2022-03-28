package classtest;

public class TV {
	//속성(property) : 색상(black), 전원상태(on/off), 채널...
	String color;
	boolean power;
	int channel;
	
	//생성자를 명시하지 않으면
	//컴파일러가 자동으로 default 생성자를
	//만들어 줌
	
	//기능(method) : 전원 on/off, 채널 변경
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++; // channel = channel + 1;
	}
	
	void channelDown() {
		channel--; // channel = channel - 1;
	}
}
