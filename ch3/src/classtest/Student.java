package classtest;

/*
 * 코딩 컨벤션 : 코딩을 할 때 읽기 쉽고 이해하기 쉽도록 정한 규칙
 * 
 * camelcase : 단어가 두개 합쳐졌을 때 뒷단어의 시작을 대문자로
 * 변수명 : 문자로 시작(소문자로 지정), studentName
 * 클래스 이름은 대문자로 시작
 * 
 * snakecase : student_name
 * */

// 접근제어자(public, private)
// class
// 클래스명(클래스 이름은 대문자로 시작)
public class Student {
	//속성(특성 : 멤버변수,property,필드,attribute) : 필수는 아님 - 멤버변수(property)
	//기능(동작) : 필수는 아님 - 멤버메소드
	
	//속성(멤버변수,property,필드,attribute) - 학번(20221010), 이름(홍길동), 주소(서울시 중구~~), 핸드폰(010-0000-0000)
	int studentId; //학번
	String studentName; //이름
	String address; //주소
	String mobile; //핸드폰
	
	//기능(멤버메소드) - 핸드폰 번호를 변경한다. 주소를 변경한다.
	void changeMobile() {} // void = 리턴타입
	void changeAddress() {}

}
