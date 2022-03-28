package extend;

public class CaptionTVEx1 {

	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재채널 " + ctv.channel);
		ctv.dispaly("Hello World");
		ctv.caption = true;
		ctv.dispaly("Hello World");
		
		
		//CaptionTV2
		CaptionTV2 ctv2 = new CaptionTV2("black",true,7,true); // CaptionTV2 생성자가 인자를 받아서 구현시 같이 지정해줘야함
		ctv2.setChannel(11);
		ctv2.channelUp();
		System.out.println("현재채널 " + ctv2.getChannel());

	}

}
