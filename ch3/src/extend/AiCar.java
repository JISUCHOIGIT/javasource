package extend;

// Car는 final class => 상속금지

public class AiCar /*extends Car*/ {
	Car car = new Car("현대"); // 포함의 관계로 객체 생성해야 함
	String msg;
}
