package access;
/*
 * 접근 제한자
 * - 객체 생성을 막아야 하는 경우
 * - 특정 메소드 호출 못하도록 하는 경우
 * - 객체의 속성을 외부에서 함부로 변경하지 못하도록 하는 경우
 * - 종류 : private < default(package) < protected < public
 *       : default : 접근제한다를 안 붙이면 됨
 * 
 * - 클래스 접근 제한
 * - public(같은 패키지, 다른 패키지), default(같은 패키지)
 * 
 * - 멤버변수의 접근 제한(접근제한자 모두 사용가능)
 * - private : 같은 패키지건 다른 패키지건 상관없이 멤버변수 사용불가, 직접적 변경불가
 * -         : 속성의 값 변경을 위해선 메소드를 통해서만 제공하고
 *           : 직접적으로 변경하는 것은 허용하지 않기 위해 사용
 * 
 * 
 * */

public class Account {
	// 속성 : 
	private String accontNo;
	private String owner;
	private int balance;
}

	//setter 메소드
	//직접 변경하지 말고 메소드를 통해서 변경(매개값의 유효성을 검증한 후 변경)
	
