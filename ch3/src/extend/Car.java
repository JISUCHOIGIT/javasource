package extend;

// final

public final class Car {
	
	//멤버변수도 가능
	private String name;
	final String color = "white"; // 변경 금지
	
	//생성자 가능
	public Car(String name) {
		super();
		this.name = name;
	}
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
