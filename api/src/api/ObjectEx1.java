package api;

// Object 메소드
// equals() : 부모는 주소비교의 형태로 정의가 되어 있음
// String 클래스에서는 오버라이딩을 통해 문자열 비교의 형태로 사용



public class ObjectEx1 {

	public static void main(String[] args) {
		
		//객체 생성 : default 생성자 호출
		Object obj1 = new Object(); // heap 주소1
		Object obj2 = new Object(); // heap 주소2
		
		//메소드 호출
		//equals() : String 문자열 비교 시 == 대신에
		//         : String의 자식 입장에서 재정의(오버라이딩)해서 값의 비교로 사용
		
		//모든 클래스들은 object 상속받게 되어 있음
		//부모 object equals는 주소비교
		//주소가 같은가?
		if(obj1.equals(obj2)) { //주소비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (obj1 == obj2) { //가끔 값의 비교로 사용할때는 오버라이딩 되어 있는 것
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("obj1.toString()"+obj1.toString()); //java.lang.Object@7d6f77cc
		System.out.println("obj2.toString()"+obj2.toString()); //java.lang.Object@5aaa6d82
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2)?"같다":"다르다");
		
	}

}
