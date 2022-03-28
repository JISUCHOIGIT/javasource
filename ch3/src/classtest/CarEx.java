package classtest;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		// 속성
		car.company = "현대";
		System.out.println("제조회사 : "+car.company);
		car.model = "아반떼";
		System.out.println("제조회사 : "+car.model);
		car.color = "white";
		System.out.println("제조회사 : "+car.color);
		car.maxSpeed = 200;
		System.out.println("제조회사 : "+car.maxSpeed);
		
		// 기능
		car.forward();
		car.backward();
		
		Student student = new Student();
	}

}
