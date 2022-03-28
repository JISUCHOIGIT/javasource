package classtest;

public class Person {
	// final : 최종적인
	//       : 무조건 초기화 필요(수정 불가)
	//       : 변수, 클래스(상속금지), 메소드(오버라이딩금지)
	
	final String nation = "Korea"; // The blank final field nation may not have been initialized
	final String ssn ;
	String name;
	
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
}
