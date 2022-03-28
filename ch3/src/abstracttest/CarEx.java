package abstracttest;

public class CarEx {

	public static void main(String[] args) {
		//Cannot instantiate the type Car
		//직접 생성 불가
//		Car car = new Car(); 
		
		Car car = new SportsCar(); // 추상메소드는 다형성 클래스로 객체 생성 가능
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		System.out.println();
		
		car = new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
	}

}
