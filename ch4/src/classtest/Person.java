package classtest;

// final : 최종적인
//       : 무조건 초기화 필요(수정 불가)
//       : 변수, 클래스(상속금지), 메소드(오버라이딩금지)

public class Person {
	final String nation = "Korea";
	final String ssn; // final이 붙으면 무조건 초기화를 해줘야함
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
