package poly;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1(); //parent
		child.method2(); //child
		child.method3(); //child
		
		System.out.println();
		
		// 부모-자식 관계만 허용
		// 왼쪽과 오른쪽이 다르게 객체를 생성할 때
		// parent 변수가 접근할 수 있는 범위는 부모 클래스에 있는 필드와
		// 메소드만 접근 가능
		// 단, 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 대신 호출됨

		Parent parent = new Child();
		parent.method1();
		parent.method2();
		
		// 상속 관계가 아님
		// Type mismatch: cannot convert from Child2 to Parent
//		Child2 child2 = new Child();
		
	}

}

















