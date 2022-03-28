package abstracttest;

public class SportsCar extends Car {
	
	//무조건 구현해야 함
	@Override
	public void drive() {
		System.out.println("스포츠카를 운전합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춥니다.");
	} //아무것도 구현하지 않아도 {}는 무조건 있어야 함

}
