package classtest;

// 클래스 : 객체의 속성과 기능을 코드로 구현
//       : 정의만 해놓은 상태

public class TV2 {
	//속성 : 색상(black), 전원상태, 채널.....
	String color;
	boolean power;
	int channel; //채널은 숫자!
	
	public TV2(String color,boolean power,int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	//기능 : 전원 on/off, 채널 변경
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
