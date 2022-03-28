package interfacetest;

public class Television implements RemoteControl,Searchable {
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) { //볼륨 > 최고볼륨
			this.volume = RemoteControl.MAX_VOLUME; // 볼륨 = 최고볼륨
		} else if(volume < RemoteControl.MIN_VOLUME) { // 볼륨 < 최저볼륨
			this.volume = RemoteControl.MIN_VOLUME; // 볼륨 = 최저볼륨
		} else {
			this.volume = volume; // 범위 안에 있다면 현재볼륨으로
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

}
