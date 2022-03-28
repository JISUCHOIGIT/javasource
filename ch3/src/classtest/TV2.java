package classtest;

public class TV2 {
	//속성(property) : 색상(black), 전원상태(on/off), 채널...
	String color;
	boolean power;
	int channel;
	
	//생성자
	public TV2(String color) {
		this.color = color;
	}
	public TV2(String color,boolean power) {
		this.color = color;
		this.power = power;
	}
	
	public TV2(String color,boolean power,int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}	
	
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
