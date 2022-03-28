package classtest;

public class PhysicalInfo {
	// 속성 - 이름, 나이, 키, 몸무게
	String name;
	int age;
	double height;
	double weight;
	
	// default 생성자 없음
	// 생성자 - 멤버변수 4개를 모두 전달인자로 받는 형태
	public PhysicalInfo (String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드 이름 - update
	// age를 받아서 현재 age를 변경하는 메소드
	void update (int age) {
		this.age = age;
	}
	// age, height 받아서 현재 age, height 변경
	void update (int age, double height) {
		this.age = age;
		this.height = height;
	}
	// age, height, weight 바다서 현재 age,height,weight 변경
	void update (int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
