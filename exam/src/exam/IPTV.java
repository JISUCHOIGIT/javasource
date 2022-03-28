package exam;

public class IPTV extends ColorTV {
	
	String address;
	
	public IPTV() {
		super();
	}

	public IPTV(int size, int color, String address) {
		super(size, color);
		this.address = address;
	}

	void printProperty(int size, int color, String address) {
		System.out.println("나의 IPTV는 " + address + "주소의 " + size + "인치 " + color + "컬러");
	}

}
