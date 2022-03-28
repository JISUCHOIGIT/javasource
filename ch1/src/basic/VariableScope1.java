package basic;

// 변수 유효 범위
// 변수를 어디서 선언했느냐에 따라 미치는 범위가 다름
// {} : 블록안에서 선언 => 선언된 블록 내에서만 사용이 가능
// 1) 클래스 내부에 선언
// 2) 메소드 내부에 선언

public class VariableScope1 { //클래스
	// 클래스 내부 선언
	//int age;

	public static void main(String[] args) { //메소드
		//메소드 내부에서 선언 -> 지역변수
		int age = 4;
		int v1 = 3;
		
		{
			v1 = age + 30; // v1의 값을 다시 한번 대입하여 재할당
//			int age = 4; // Duplicate local variable age, 영향력이 똑같이 미치는 구역 안에 동일한 변수명을 설정했기에 사용불가
			int v2 = 45;
			System.out.println("v2 = " + v2);
		}
		System.out.println("v1 = " + v1);
//		System.out.println("v2 = " + v2); // v2 cannot be resolved to a variable
	} // 메인 메소드 벗어나기 전까지는 age, v1 사용 가능 / 지역변수 <-
	
	public static void print() {
//		System.out.println(age); //age cannot be resolved to a variable , age란 변수는 메소드 내부에서 벗어나서는 사용불가능
	}

}
